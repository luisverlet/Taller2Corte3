
package taller1;

import java.util.Scanner;


public class Ejercicio_9 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba la cantidad de numeros primos que quiere mostrar: ");
            int numero = teclado.nextInt();
            int count = 0;
            int i = 2;

            while (count < numero) {
                boolean Primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        Primo = false;
                        break;
                    }
                }
                if (Primo) {
                    System.out.print(i + " ");
                    count++;
                }

                i++;
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
