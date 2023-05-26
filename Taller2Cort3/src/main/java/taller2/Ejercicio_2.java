
package taller2;

import java.util.Scanner;


public class Ejercicio_2 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba el numero :");
            int numero1 = teclado.nextInt();

            if (numero1 % 2 == 0) {
                System.out.print("El numero es par ");
            } else {

                System.out.print("El  numero es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
