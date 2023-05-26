
package taller1;

import java.util.Scanner;


public class Ejercicio_4 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba el primer numero:");
            int numero1 = teclado.nextInt();

            System.out.print("Escriba el segundo numero:");
            int numero2 = teclado.nextInt();

            int x = numero1;

            while (x <= numero2) {
                if (x % 2 == 0) {
                    System.out.println("Los numeros pares seran: " + x);
                }
                x++;

            }
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
