package superficies;

import java.util.Scanner;

public class Vista {

    private static Scanner sc;

    public Vista() {

    }

    public void Introducir(Modelo mod) {

        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        mod.shapeType = sc.nextLine();
        System.out.println("You said: " + mod.shapeType);

    }
    
    public void impr(float area){
        System.out.println("The area for your figure: " + area);
    }

    public void Cuadrado(Modelo mod) {
        System.out.println("what is the side length?");
        mod.setSideLength(sc.nextFloat());
    }

    public void Rectangulo(Modelo mod) {
        System.out.println("what is the rectangles width?");
        mod.setSideLength(sc.nextFloat());
        System.out.println("What is the rectangles height?");
        mod.setSideHeight(sc.nextFloat());
    }

    public void Triangulo(Modelo mod) {
        System.out.println("What is the base length of the triangle?");
        mod.setBaseLength(sc.nextFloat());
        System.out.println("What is the height of the triangle?");
        mod.setHeight(sc.nextFloat());
    }

    public void Circulo(Modelo mod) {
        System.out.println("What is the radius of the circle?");
        mod.setRadius(sc.nextFloat());
    }

}
