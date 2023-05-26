
package taller1;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba la base:");
            double base = teclado.nextDouble();

            System.out.print("Escriba el exponente:");
            int exponente = teclado.nextInt();

            double resultado = 1;

            for (int i = 1; i < exponente; i++) {

                resultado *= base;

            }
            System.out.println(base + " elevado a la potencia " + exponente + " es igual a " + resultado);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
