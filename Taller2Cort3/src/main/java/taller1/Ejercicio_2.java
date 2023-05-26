
package taller1;

import java.util.Scanner;


public class Ejercicio_2 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba la cantidad de numeros :");
            int cannumeros = teclado.nextInt();

            int mayores = 0;
            int menores = 0;
            int iguales = 0;

            for (int i = 1; i <= cannumeros; i++) {

                System.out.print(("Escriba el numero " + i + ":"));
                int numero = teclado.nextInt();

                if (numero < 0) {

                    menores++;

                } else if (numero > 0) {

                    mayores++;
                } else {

                    iguales++;
                }

            }
            System.out.print("La cantidad de numeros mayores a 0 es: " + mayores);
            System.out.print("La cantidad de numeros menores a 0 es: " + menores);
            System.out.print("La cantidad de numeros iguales a 0 es: " + iguales);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}

