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
 * A set of parameters for {@link
 * com.gpudb.GPUdb#filterByRange(FilterByRangeRequest)}.
 * <p>
 * Calculates which objects from a table have a column that is within the given
 * bounds. An object from the table identified by {@code tableName} is added to
 * the view {@code viewName} if its column is within [{@code lowerBound},
 * {@code upperBound}] (inclusive). The operation is synchronous. The response
 * provides a count of the number of objects which passed the bound filter.
 * <p>
 * For track objects, the count reflects how many points fall within the given
 * bounds (which may not include all the track points of any given track).
 */
public class FilterByRangeRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("FilterByRangeRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("viewName").type().stringType().noDefault()
                .name("columnName").type().stringType().noDefault()
                .name("lowerBound").type().doubleType().noDefault()
                .name("upperBound").type().doubleType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
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

    private String tableName;
    private String viewName;
    private String columnName;
    private double lowerBound;
    private double upperBound;
    private Map<String, String> options;


    /**
     * Constructs a FilterByRangeRequest object with default parameters.
     */
    public FilterByRangeRequest() {
        tableName = "";
        viewName = "";
        columnName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a FilterByRangeRequest object with the specified parameters.
     * 
     * @param tableName  Name of the table on which the filter by range
     *                   operation will be performed.  Must be a valid GPUdb
     *                   table.
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results. Must not be an already existing
     *                  collection, table or view.
     * @param columnName  Name of a column or an expression of one or more
     *                    columns on which the operation would be applied.
     * @param lowerBound  Value of the lower bound (inclusive).
     * @param upperBound  Value of the upper bound (inclusive).
     * @param options  Optional parameters.
     * 
     */
    public FilterByRangeRequest(String tableName, String viewName, String columnName, double lowerBound, double upperBound, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.viewName = (viewName == null) ? "" : viewName;
        this.columnName = (columnName == null) ? "" : columnName;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table on which the filter by range operation will be
     *         performed.  Must be a valid GPUdb table.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table on which the filter by range
     *                   operation will be performed.  Must be a valid GPUdb
     *                   table.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRangeRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return If provided, then this will be the name of the view containing
     *         the results. Must not be an already existing collection, table
     *         or view.
     * 
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * 
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results. Must not be an already existing
     *                  collection, table or view.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRangeRequest setViewName(String viewName) {
        this.viewName = (viewName == null) ? "" : viewName;
        return this;
    }

    /**
     * 
     * @return Name of a column or an expression of one or more columns on
     *         which the operation would be applied.
     * 
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 
     * @param columnName  Name of a column or an expression of one or more
     *                    columns on which the operation would be applied.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRangeRequest setColumnName(String columnName) {
        this.columnName = (columnName == null) ? "" : columnName;
        return this;
    }

    /**
     * 
     * @return Value of the lower bound (inclusive).
     * 
     */
    public double getLowerBound() {
        return lowerBound;
    }

    /**
     * 
     * @param lowerBound  Value of the lower bound (inclusive).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRangeRequest setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    /**
     * 
     * @return Value of the upper bound (inclusive).
     * 
     */
    public double getUpperBound() {
        return upperBound;
    }

    /**
     * 
     * @param upperBound  Value of the upper bound (inclusive).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRangeRequest setUpperBound(double upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRangeRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
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
                return this.tableName;

            case 1:
                return this.viewName;

            case 2:
                return this.columnName;

            case 3:
                return this.lowerBound;

            case 4:
                return this.upperBound;

            case 5:
                return this.options;

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
                this.tableName = (String)value;
                break;

            case 1:
                this.viewName = (String)value;
                break;

            case 2:
                this.columnName = (String)value;
                break;

            case 3:
                this.lowerBound = (Double)value;
                break;

            case 4:
                this.upperBound = (Double)value;
                break;

            case 5:
                this.options = (Map<String, String>)value;
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

        FilterByRangeRequest that = (FilterByRangeRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.viewName.equals( that.viewName )
                 && this.columnName.equals( that.columnName )
                 && ( (Double)this.lowerBound ).equals( (Double)that.lowerBound )
                 && ( (Double)this.upperBound ).equals( (Double)that.upperBound )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "tableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableName ) );
        builder.append( ", " );
        builder.append( gd.toString( "viewName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.viewName ) );
        builder.append( ", " );
        builder.append( gd.toString( "columnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.columnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "lowerBound" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.lowerBound ) );
        builder.append( ", " );
        builder.append( gd.toString( "upperBound" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.upperBound ) );
        builder.append( ", " );
        builder.append( gd.toString( "options" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.options ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.viewName.hashCode();
        hashCode = (31 * hashCode) + this.columnName.hashCode();
        hashCode = (31 * hashCode) + ((Double)this.lowerBound).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.upperBound).hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
