
package taller2;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba el numero :");
            double numero1 = teclado.nextDouble();

            System.out.print("Escriba el siguiente numero :");
            double numero2 = teclado.nextDouble();

            if (numero2 == 0) {

                System.out.print("Lo siento un numero no se puede dividir entre 0 ");

            } else {
                System.out.print("El resultado de la division sera: " + (numero1 / numero2));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

