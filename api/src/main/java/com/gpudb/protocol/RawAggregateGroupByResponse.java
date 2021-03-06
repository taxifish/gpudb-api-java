/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.nio.ByteBuffer;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#aggregateGroupByRaw(AggregateGroupByRequest)}.
 */
public class RawAggregateGroupByResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("RawAggregateGroupByResponse")
            .namespace("com.gpudb")
            .fields()
                .name("responseSchemaStr").type().stringType().noDefault()
                .name("binaryEncodedResponse").type().bytesType().noDefault()
                .name("jsonEncodedResponse").type().stringType().noDefault()
                .name("totalNumberOfRecords").type().longType().noDefault()
                .name("hasMoreRecords").type().booleanType().noDefault()
            .endRecord();


    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @return  the schema for the class.
     * 
     */
    public static Schema getClassSchema() {
        return schema$;
    }

    private String responseSchemaStr;
    private ByteBuffer binaryEncodedResponse;
    private String jsonEncodedResponse;
    private long totalNumberOfRecords;
    private boolean hasMoreRecords;


    /**
     * Constructs a RawAggregateGroupByResponse object with default parameters.
     */
    public RawAggregateGroupByResponse() {
    }

    /**
     * 
     * @return Avro schema of {@code binaryEncodedResponse} or {@code
     *         jsonEncodedResponse}.
     * 
     */
    public String getResponseSchemaStr() {
        return responseSchemaStr;
    }

    /**
     * 
     * @param responseSchemaStr  Avro schema of {@code binaryEncodedResponse}
     *                           or {@code jsonEncodedResponse}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawAggregateGroupByResponse setResponseSchemaStr(String responseSchemaStr) {
        this.responseSchemaStr = (responseSchemaStr == null) ? "" : responseSchemaStr;
        return this;
    }

    /**
     * 
     * @return Avro binary encoded response.
     * 
     */
    public ByteBuffer getBinaryEncodedResponse() {
        return binaryEncodedResponse;
    }

    /**
     * 
     * @param binaryEncodedResponse  Avro binary encoded response.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawAggregateGroupByResponse setBinaryEncodedResponse(ByteBuffer binaryEncodedResponse) {
        this.binaryEncodedResponse = (binaryEncodedResponse == null) ? ByteBuffer.wrap( new byte[0] ) : binaryEncodedResponse;
        return this;
    }

    /**
     * 
     * @return Avro JSON encoded response.
     * 
     */
    public String getJsonEncodedResponse() {
        return jsonEncodedResponse;
    }

    /**
     * 
     * @param jsonEncodedResponse  Avro JSON encoded response.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawAggregateGroupByResponse setJsonEncodedResponse(String jsonEncodedResponse) {
        this.jsonEncodedResponse = (jsonEncodedResponse == null) ? "" : jsonEncodedResponse;
        return this;
    }

    /**
     * 
     * @return Total/Filtered number of records.
     * 
     */
    public long getTotalNumberOfRecords() {
        return totalNumberOfRecords;
    }

    /**
     * 
     * @param totalNumberOfRecords  Total/Filtered number of records.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawAggregateGroupByResponse setTotalNumberOfRecords(long totalNumberOfRecords) {
        this.totalNumberOfRecords = totalNumberOfRecords;
        return this;
    }

    /**
     * 
     * @return Too many records. Returned a partial set.
     * 
     */
    public boolean getHasMoreRecords() {
        return hasMoreRecords;
    }

    /**
     * 
     * @param hasMoreRecords  Too many records. Returned a partial set.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawAggregateGroupByResponse setHasMoreRecords(boolean hasMoreRecords) {
        this.hasMoreRecords = hasMoreRecords;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @return the schema object describing this class.
     * 
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @param index  the position of the field to get
     * 
     * @return value of the field with the given index.
     * 
     * @throws IndexOutOfBoundsException
     * 
     */
    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.responseSchemaStr;

            case 1:
                return this.binaryEncodedResponse;

            case 2:
                return this.jsonEncodedResponse;

            case 3:
                return this.totalNumberOfRecords;

            case 4:
                return this.hasMoreRecords;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @param index  the position of the field to set
     * @param value  the value to set
     * 
     * @throws IndexOutOfBoundsException
     * 
     */
    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.responseSchemaStr = (String)value;
                break;

            case 1:
                this.binaryEncodedResponse = (ByteBuffer)value;
                break;

            case 2:
                this.jsonEncodedResponse = (String)value;
                break;

            case 3:
                this.totalNumberOfRecords = (Long)value;
                break;

            case 4:
                this.hasMoreRecords = (Boolean)value;
                break;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == this ) {
            return true;
        }

        if( (obj == null) || (obj.getClass() != this.getClass()) ) {
            return false;
        }

        RawAggregateGroupByResponse that = (RawAggregateGroupByResponse)obj;

        return ( this.responseSchemaStr.equals( that.responseSchemaStr )
                 && this.binaryEncodedResponse.equals( that.binaryEncodedResponse )
                 && this.jsonEncodedResponse.equals( that.jsonEncodedResponse )
                 && ( this.totalNumberOfRecords == that.totalNumberOfRecords )
                 && ( this.hasMoreRecords == that.hasMoreRecords ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "responseSchemaStr" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.responseSchemaStr ) );
        builder.append( ", " );
        builder.append( gd.toString( "binaryEncodedResponse" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.binaryEncodedResponse ) );
        builder.append( ", " );
        builder.append( gd.toString( "jsonEncodedResponse" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.jsonEncodedResponse ) );
        builder.append( ", " );
        builder.append( gd.toString( "totalNumberOfRecords" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.totalNumberOfRecords ) );
        builder.append( ", " );
        builder.append( gd.toString( "hasMoreRecords" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.hasMoreRecords ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.responseSchemaStr.hashCode();
        hashCode = (31 * hashCode) + this.binaryEncodedResponse.hashCode();
        hashCode = (31 * hashCode) + this.jsonEncodedResponse.hashCode();
        hashCode = (31 * hashCode) + ((Long)this.totalNumberOfRecords).hashCode();
        hashCode = (31 * hashCode) + ((Boolean)this.hasMoreRecords).hashCode();
        return hashCode;
    }

}
