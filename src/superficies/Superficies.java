package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    /**
     * @param args the command line arguments
     */
    static Modelo mod = new Modelo();

    public static void main(String[] args) {

        Vista vis = new Vista();////

        vis.Introducir(mod);

        if (mod.getShapeType().equalsIgnoreCase("square")) {
            //add area calculations for square
            vis.Cuadrado(mod);

            mod.setSquareArea(mod.getSideLength()*mod.getSideLength());
            vis.impr(mod.getSquareArea());
            

        }
        if (mod.getShapeType().equalsIgnoreCase("rectangle")) {
            //add area calculations for rectangle here
            vis.Rectangulo(mod);

            mod.setRectangleArea(mod.getSideLength()*mod.getSideHeight());
            vis.impr(mod.getRectangleArea());

        }
        if (mod.getShapeType().equalsIgnoreCase("triangle")) {
            //add area calculations for triangle here
            vis.Triangulo(mod);

            mod.setTriangleArea(0.5*mod.getBaseLength()*mod.getHeight());
            System.out.println("Your triangles area is: " + triangleArea);

        }
        if (mod.getShapeType().equalsIgnoreCase("circle")) {
            //add area calculations for a circle here
            vis.Circulo(mod);

            circleArea = radius * radius;
            circleArea = (float) (3.14159265 * circleArea);
            System.out.println("Your Circles area is " + circleArea);

        }

    }
}
