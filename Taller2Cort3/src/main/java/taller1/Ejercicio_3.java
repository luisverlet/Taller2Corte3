
package taller1;

import java.util.Scanner;


public class Ejercicio_3 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            char p;

            do {
                System.out.print("Escriba caracteres:");
                p = teclado.nextLine().charAt(0);

                if (p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u' || p == 'A' || p == 'E' || p == 'I' || p == 'O' || p == 'U') {

                    System.out.println("ES UNA VOCAL");
                } else if (p != ' ') {

                    System.out.println(" NO ES UNA VOCAL");

                }

            } while (p != ' ');
            System.out.println("Programa terminado.");
            teclado.close();
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
