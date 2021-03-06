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
 * com.gpudb.GPUdb#filterByRadius(FilterByRadiusRequest)}.
 * <p>
 * Calculates which objects from a table lie within a circle with the given
 * radius and center point (i.e. circular NAI). The operation is synchronous
 * meaning that GPUdb will not return a response until all the objects are
 * fully available. The response payload provides the count of the resulting
 * set. A new resultant set (view) which satisfies the input circular NAI
 * restriction specification is also created if a {@code viewName} is passed in
 * as part of the request.
 * <p>
 * For track data, all track points that lie within the circle plus one point
 * on either side of the circle (if the track goes beyond the circle) will be
 * included in the result. For shapes, e.g. polygons, all polygons that
 * intersect the circle will be included (even if none of the points of the
 * polygon fall within the circle).
 */
public class FilterByRadiusRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("FilterByRadiusRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("viewName").type().stringType().noDefault()
                .name("xColumnName").type().stringType().noDefault()
                .name("xCenter").type().doubleType().noDefault()
                .name("yColumnName").type().stringType().noDefault()
                .name("yCenter").type().doubleType().noDefault()
                .name("radius").type().doubleType().noDefault()
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
    private String xColumnName;
    private double xCenter;
    private String yColumnName;
    private double yCenter;
    private double radius;
    private Map<String, String> options;


    /**
     * Constructs a FilterByRadiusRequest object with default parameters.
     */
    public FilterByRadiusRequest() {
        tableName = "";
        viewName = "";
        xColumnName = "";
        yColumnName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a FilterByRadiusRequest object with the specified parameters.
     * 
     * @param tableName  Name of the table on which the filter by radius
     *                   operation will be performed.  Must be an existing
     *                   table in GPUdb.
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results. Must not be an already existing
     *                  collection, table or view.
     * @param xColumnName  Name of the column to be used for the x-coordinate
     *                     (the longitude) of the center.
     * @param xCenter  Value of the longitude of the center. Must be within
     *                 [-180.0, 180.0].  The minimum allowed value is -180. The
     *                 maximum allowed value is 180.
     * @param yColumnName  Name of the column to be used for the y-coordinate-
     *                     the latitude-of the center.
     * @param yCenter  Value of the latitude of the center. Must be within
     *                 [-90.0, 90.0].  The minimum allowed value is -90. The
     *                 maximum allowed value is 90.
     * @param radius  The radius of the circle within which the search will be
     *                performed. Must be a non-zero positive value. It is in
     *                meters; so, for example, a value of '42000' means 42 km.
     *                The minimum allowed value is 0. The maximum allowed value
     *                is MAX_INT.
     * @param options  Optional parameters.
     * 
     */
    public FilterByRadiusRequest(String tableName, String viewName, String xColumnName, double xCenter, String yColumnName, double yCenter, double radius, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.viewName = (viewName == null) ? "" : viewName;
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        this.xCenter = xCenter;
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
        this.yCenter = yCenter;
        this.radius = radius;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table on which the filter by radius operation will
     *         be performed.  Must be an existing table in GPUdb.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table on which the filter by radius
     *                   operation will be performed.  Must be an existing
     *                   table in GPUdb.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusRequest setTableName(String tableName) {
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
    public FilterByRadiusRequest setViewName(String viewName) {
        this.viewName = (viewName == null) ? "" : viewName;
        return this;
    }

    /**
     * 
     * @return Name of the column to be used for the x-coordinate (the
     *         longitude) of the center.
     * 
     */
    public String getXColumnName() {
        return xColumnName;
    }

    /**
     * 
     * @param xColumnName  Name of the column to be used for the x-coordinate
     *                     (the longitude) of the center.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusRequest setXColumnName(String xColumnName) {
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        return this;
    }

    /**
     * 
     * @return Value of the longitude of the center. Must be within [-180.0,
     *         180.0].  The minimum allowed value is -180. The maximum allowed
     *         value is 180.
     * 
     */
    public double getXCenter() {
        return xCenter;
    }

    /**
     * 
     * @param xCenter  Value of the longitude of the center. Must be within
     *                 [-180.0, 180.0].  The minimum allowed value is -180. The
     *                 maximum allowed value is 180.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusRequest setXCenter(double xCenter) {
        this.xCenter = xCenter;
        return this;
    }

    /**
     * 
     * @return Name of the column to be used for the y-coordinate-the latitude-
     *         of the center.
     * 
     */
    public String getYColumnName() {
        return yColumnName;
    }

    /**
     * 
     * @param yColumnName  Name of the column to be used for the y-coordinate-
     *                     the latitude-of the center.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusRequest setYColumnName(String yColumnName) {
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
        return this;
    }

    /**
     * 
     * @return Value of the latitude of the center. Must be within [-90.0,
     *         90.0].  The minimum allowed value is -90. The maximum allowed
     *         value is 90.
     * 
     */
    public double getYCenter() {
        return yCenter;
    }

    /**
     * 
     * @param yCenter  Value of the latitude of the center. Must be within
     *                 [-90.0, 90.0].  The minimum allowed value is -90. The
     *                 maximum allowed value is 90.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusRequest setYCenter(double yCenter) {
        this.yCenter = yCenter;
        return this;
    }

    /**
     * 
     * @return The radius of the circle within which the search will be
     *         performed. Must be a non-zero positive value. It is in meters;
     *         so, for example, a value of '42000' means 42 km.  The minimum
     *         allowed value is 0. The maximum allowed value is MAX_INT.
     * 
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 
     * @param radius  The radius of the circle within which the search will be
     *                performed. Must be a non-zero positive value. It is in
     *                meters; so, for example, a value of '42000' means 42 km.
     *                The minimum allowed value is 0. The maximum allowed value
     *                is MAX_INT.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusRequest setRadius(double radius) {
        this.radius = radius;
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
    public FilterByRadiusRequest setOptions(Map<String, String> options) {
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
                return this.xColumnName;

            case 3:
                return this.xCenter;

            case 4:
                return this.yColumnName;

            case 5:
                return this.yCenter;

            case 6:
                return this.radius;

            case 7:
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
                this.xColumnName = (String)value;
                break;

            case 3:
                this.xCenter = (Double)value;
                break;

            case 4:
                this.yColumnName = (String)value;
                break;

            case 5:
                this.yCenter = (Double)value;
                break;

            case 6:
                this.radius = (Double)value;
                break;

            case 7:
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

        FilterByRadiusRequest that = (FilterByRadiusRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.viewName.equals( that.viewName )
                 && this.xColumnName.equals( that.xColumnName )
                 && ( (Double)this.xCenter ).equals( (Double)that.xCenter )
                 && this.yColumnName.equals( that.yColumnName )
                 && ( (Double)this.yCenter ).equals( (Double)that.yCenter )
                 && ( (Double)this.radius ).equals( (Double)that.radius )
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
        builder.append( gd.toString( "xColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.xColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "xCenter" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.xCenter ) );
        builder.append( ", " );
        builder.append( gd.toString( "yColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.yColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "yCenter" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.yCenter ) );
        builder.append( ", " );
        builder.append( gd.toString( "radius" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.radius ) );
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
        hashCode = (31 * hashCode) + this.xColumnName.hashCode();
        hashCode = (31 * hashCode) + ((Double)this.xCenter).hashCode();
        hashCode = (31 * hashCode) + this.yColumnName.hashCode();
        hashCode = (31 * hashCode) + ((Double)this.yCenter).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.radius).hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
