
package taller1;

import java.util.Scanner;


public class Ejercicio_11 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            int[] numeros = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.print("Escriba el numero " + i + ":");
                numeros[i] = teclado.nextInt();
            }

            for (int i = 9; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
