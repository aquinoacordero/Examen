package superficies;

import java.util.Scanner;

public class Vista {

    private static Scanner sc;

    public Vista() {

    }

    public void Imprimir(Modelo mod) {

        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        mod.shapeType = sc.nextLine();
        System.out.println("You said: " + mod.shapeType);
    }

}
