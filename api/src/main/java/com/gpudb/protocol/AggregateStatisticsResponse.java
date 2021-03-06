/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#aggregateStatistics(AggregateStatisticsRequest)}.
 */
public class AggregateStatisticsResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateStatisticsResponse")
            .namespace("com.gpudb")
            .fields()
                .name("stats").type().map().values().doubleType().noDefault()
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

    private Map<String, Double> stats;


    /**
     * Constructs an AggregateStatisticsResponse object with default
     * parameters.
     */
    public AggregateStatisticsResponse() {
    }

    /**
     * 
     * @return (statistic name, double value) pairs of the requested
     *         statistics, including the total count by default.
     * 
     */
    public Map<String, Double> getStats() {
        return stats;
    }

    /**
     * 
     * @param stats  (statistic name, double value) pairs of the requested
     *               statistics, including the total count by default.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateStatisticsResponse setStats(Map<String, Double> stats) {
        this.stats = (stats == null) ? new LinkedHashMap<String, Double>() : stats;
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
                return this.stats;

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
                this.stats = (Map<String, Double>)value;
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

        AggregateStatisticsResponse that = (AggregateStatisticsResponse)obj;

        return ( this.stats.equals( that.stats ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "stats" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.stats ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.stats.hashCode();
        return hashCode;
    }

}
