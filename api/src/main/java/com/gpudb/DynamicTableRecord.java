package com.gpudb;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.generic.IndexedRecord;

final class DynamicTableRecord extends RecordBase {
    @SuppressWarnings("unchecked")
    public static List<Record> transpose(String schemaString, ByteBuffer encodedData) throws GPUdbException {
        Schema schema;

        try {
            schema = new Schema.Parser().parse(schemaString);
        } catch (Exception ex) {
            throw new GPUdbException("Schema is invalid.", ex);
        }

        if (schema.getType() != Schema.Type.RECORD) {
            throw new GPUdbException("Schema must be of type record.");
        }

        IndexedRecord data = Avro.decode(schema, encodedData);
        int fieldCount = schema.getFields().size() - 1;
        int recordCount = ((List<?>)data.get(0)).size();
        List<String> expressions = (List<String>)data.get(fieldCount);
        List<Type.Column> columns = new ArrayList<>();

        for (int i = 0; i < fieldCount; i++) {
            Field field = schema.getFields().get(i);

            if (field.schema().getType() != Schema.Type.ARRAY) {
                throw new GPUdbException("Field " + field.name() + " must be of type array.");
            }

            Class<?> columnType;

            switch (field.schema().getElementType().getType()) {
                case BYTES:
                    columnType = ByteBuffer.class;
                    break;

                case DOUBLE:
                    columnType = Double.class;
                    break;

                case FLOAT:
                    columnType = Float.class;
                    break;

                case INT:
                    columnType = Integer.class;
                    break;

                case LONG:
                    columnType = Long.class;
                    break;

                case STRING:
                    columnType = String.class;
                    break;

                default:
                    throw new GPUdbException("Field " + field.name() + " must be of type bytes, double, float, int, long or string.");
            }

            if (((List<?>)data.get(i)).size() != recordCount) {
                throw new GPUdbException("Fields must all have the same number of elements.");
            }

            columns.add(new Type.Column(expressions.get(i), columnType));
        }

        Type type = new Type("", columns);
        List<Record> result = new ArrayList<>();

        for (int i = 0; i < recordCount; i++) {
            result.add(new DynamicTableRecord(type, data, i));
        }

        return result;
    }

    private final Type type;
    private final IndexedRecord data;
    private final int recordIndex;

    private DynamicTableRecord(Type type, IndexedRecord data, int recordIndex) {
        this.type = type;
        this.data = data;
        this.recordIndex = recordIndex;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Object get(int index) {
        return ((List<?>)data.get(index)).get(recordIndex);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        ((List)data.get(index)).set(recordIndex, value);
    }
}