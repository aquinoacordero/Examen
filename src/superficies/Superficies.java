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
    
    /**
     * 
     * @see parte principal del programa que realiza las tareas logicas
     * 
     */

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

            mod.setTriangleArea((float)(0.5*mod.getBaseLength()*mod.getHeight()));
            vis.impr(mod.getTriangleArea());

        }
        if (mod.getShapeType().equalsIgnoreCase("circle")) {
            //add area calculations for a circle here
            vis.Circulo(mod);

            mod.setCircleArea((float)(3.141592*mod.getRadius()*mod.getRadius()));
            vis.impr(mod.getCircleArea());

        }

    }
}
