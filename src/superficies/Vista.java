package superficies;

import java.util.Scanner;
/**
 * 
 * @author aquinoacordero
 */

public class Vista {

    private static Scanner sc;

    public Vista() {

    }
    
    /**
     * 
     * @param mod 
     * 
     * Recoge la figura de la cual el usuario quiere obtener el area
     * 
     */

    public void Introducir(Modelo mod) {

        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        mod.shapeType = sc.nextLine();
        System.out.println("You said: " + mod.shapeType);

    }
    
    /**
     * 
     * @param area 
     * 
     * Devuelve el area de la figura analizada
     */
    
    public void impr(float area){
        System.out.println("The area for your figure: " + area);
    }
    
    /**
     * 
     * @param mod 
     * 
     * Pide la documentacion necesaria para obtener el area del cuadrado
     */

    public void Cuadrado(Modelo mod) {
        System.out.println("what is the side length?");
        mod.setSideLength(sc.nextFloat());
    }
    
    /**
     * 
     * @param mod 
     * 
     * Pide la documentacion necesaria para obtener el area del rectangulo
     */

    public void Rectangulo(Modelo mod) {
        System.out.println("what is the rectangles width?");
        mod.setSideLength(sc.nextFloat());
        System.out.println("What is the rectangles height?");
        mod.setSideHeight(sc.nextFloat());
    }
    /**
     * 
     * @param mod 
     * 
     * Pide la documentacion necesaria para obtener el area del triangulo
     */

    public void Triangulo(Modelo mod) {
        System.out.println("What is the base length of the triangle?");
        mod.setBaseLength(sc.nextFloat());
        System.out.println("What is the height of the triangle?");
        mod.setHeight(sc.nextFloat());
    }
    /**
     * 
     * @param mod 
     * 
     * Pide la documentacion necesaria para obtener el area del circulo
     */

    public void Circulo(Modelo mod) {
        System.out.println("What is the radius of the circle?");
        mod.setRadius(sc.nextFloat());
    }

}
