package superficies;

/**
 *
 * @author aquinoacordero
 *
 */

public class Modelo {

    String shapeType;
    float squareArea;
    float rectangleArea;
    float triangleArea;
    float sideLength;
    float sideHeight;
    float baseLength;
    float height;
    float radius;
    float circleArea;

    /**
     * @return sideHeight lado de la figura
     */
    public float getSideHeight() {

        return sideHeight;
    }

    public void setSideHeight(float sideHeight) {
        this.sideHeight = sideHeight;
    }

    /**
     * @return baseLenght longitud de la base
     */
    public float getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    /**
     * @return Height altura de la figura
     */
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    /**
     *
     * @return Radius radio de la figura
     */
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     *
     * @return CircleArea area del circulo
     */
    public float getCircleArea() {
        return circleArea;
    }

    public void setCircleArea(float circleArea) {
        this.circleArea = circleArea;
    }
    /**
     * 
     * @return shapeType tipo de figura
     */

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }
    
    /**
     * 
     * @return SquareArea area del cuadrado
     */

    public float getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(float squareArea) {
        this.squareArea = squareArea;
    }
    
    /**
     * 
     * @return  SedeLenght longitud de un lado de la figura;
     */

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }
    
    /**
     * 
     * @return RectangleArea area del rectangulo
     */

    public float getRectangleArea() {
        return rectangleArea;
    }

    public void setRectangleArea(float rectangleArea) {
        this.rectangleArea = rectangleArea;
    }
    /**
     * 
     * @return TriangleArea area del triangulo
     */

    public float getTriangleArea() {
        return triangleArea;
    }

    public void setTriangleArea(float triangleArea) {
        this.triangleArea = triangleArea;
    }

}
