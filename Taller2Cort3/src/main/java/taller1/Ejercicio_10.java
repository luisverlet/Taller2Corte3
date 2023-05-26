
package taller1;

import java.util.Scanner;


public class Ejercicio_10 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba la cantidad de filas de la piramide");
            int filas = teclado.nextInt();

            for (int i = 1; i < filas; i++) {

                for (int j = 1; j <= filas - i; j++) {
                    System.out.print(" ");
                }

               
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
