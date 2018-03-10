package GIS.geometry;

/*
 */
/** 
 *  Polygon class, inherits from Polyline.
 *  A Polygon is just a closed Polyline. When finished drawing, the first point from the Polyline will be added as last point to close the Polygon (method: closePolygon)
 *  Refer to the object Polyline for the inherited methods to fill the pointlist and write to or create from DB/CSV friendly formats.
 *  Additional attributes for Polylines are: circumference and area.
 * @author Lukas
 */
public class GISPolygon extends GISPolyline {
  /* {author=Lukas, version=1.0}*/
    
  /** 
   *  the circumference of the Polygon
   */
  public float circumference;

  /** 
   *  the area of the Polygon
   */
  public float area;

   /** 
   *  Constructor: because GISPolygon extends from GISPolyline and not from Geometry,
   *  the type field of the super.super class can not be acessed (not allowed);
   *  The attribute needs to be changed indirectly by calling the setTypeToPolygon()
   *  method of the class GISPolyline
   */
  public GISPolygon() {
      setTypeToPolygon(); 
  }

  /** 
   *  when finished drawing, the first point of the pointlist will be added as the last point to close the polyline.
   */
  public void closePolygon() {
  /* {author=Lukas, version=1.0}*/
    if (!pointlist.isEmpty()){
        pointlist.add(pointlist.get(0));
        NoPoints = pointlist.size();
    }
    else{
        System.err.println("closePolygon(): no Points in Pointlist");
    }
  }

  /** 
   *  calculate the circumference of a Polygon, stored in Attribute circumference.
   * (not realized yet, could be done using the Path2D object)
   */
  public void calculateCircumference() {
  /* {author=Lukas, version=1.0}*/

  }

  /** 
   *  returns the value of attribute circumference of a Polyline.
   * (if the attribute is not filled yet, tell the user to use calculateCircumference)
   * (not realized yet, could be done using the Path2D object)
   *  @return the circumference (float)
   */
  public float getCircumference() {
  /* {author=Lukas, version=1.0}*/

  return (float) 0.0;
  }

  /** 
   *  calculate the area of a Polygon, stored in Attribute area.
   */
  public void calculateArea() {
  /* {author=Lukas, version=1.0}*/

  }

  /** 
   *  returns the value of attribute area of a Polyline.
   *  (if the attribute is not filled yet, tell the user to use calculateArea)
   *  (not realized yet, could be done using the Path2D object)
     * @return the area (float)
   */
  public float getArea() {
  /* {author=Lukas, version=1.0}*/

  return (float) 0.0;
  }

}