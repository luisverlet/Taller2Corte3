
package taller1;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio_1 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            Random random = new Random();
            int numeroAleatorio = random.nextInt(100) + 1;
            int intentos = 10;

            while (intentos > 0) {

                System.out.print("Adivina el numero de 1-100: ");
                int numero = teclado.nextInt();

                if (numero == numeroAleatorio) {

                    System.out.print("Adivinaste el numero en " + (11 - intentos) + "Intentos");

                } else if (numero < numeroAleatorio) {

                    System.out.println("El numero aleatorio es mayor ,te quedan " + --intentos + "intentos");

                } else {

                    System.out.println("El numero aleatorio es menos , te quedan " + --intentos + "intentos");

                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
