
package taller1;

import java.util.Scanner;


public class Ejercicio_12 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            int[] numeros = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.print("Escriba el numero " + i + ":");
                numeros[i] = teclado.nextInt();
            }
            int maximo = numeros[0];
            int minimo = numeros[0];

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maximo) {
                    maximo = numeros[i];
                }
                if (numeros[i] < minimo) {
                    minimo = numeros[i];
                }

            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
                if (numeros[i] == maximo) {
                    System.out.print("máximo");
                }
                if (numeros[i] == minimo) {
                    System.out.print("mínimo");
                }
                System.out.println();
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}

