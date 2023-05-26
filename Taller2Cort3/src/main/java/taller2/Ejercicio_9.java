
package taller2;

import java.util.Scanner;


public class Ejercicio_9 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Escriba un año: ");
            int año = teclado.nextInt();

            if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                System.out.println(año + " es un año bisiesto.");
            } else {
                System.out.println(año + " no es un año bisiesto.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
