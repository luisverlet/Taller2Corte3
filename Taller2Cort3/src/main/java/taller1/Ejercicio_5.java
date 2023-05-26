
package taller1;

import java.util.Scanner;


public class Ejercicio_5 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            int numero, suma = 0, dentro = 0, fuera = 0;
            boolean igualLimite = false, limiteCorrecto = false;

            System.out.print("Escriba el limite inferior:");
            int limiteI = teclado.nextInt();

            System.out.print("Escriba el limite Superior:");
            int limiteS = teclado.nextInt();

            if (limiteI >= limiteS) {

                System.out.println("¡¡¡VUELVE A INGRESAR LOS LIMITES, ACUERDATE QUE EL INFERIOR DEBE SER MENOR QUE LE SUPERIOR!!!!");

                System.out.print("Escriba el limite inferior:");
                limiteI = teclado.nextInt();

                System.out.print("Escriba el limite Superior:");
                limiteS = teclado.nextInt();

            }
            do {
                System.out.print("Escriba un número (0 para terminar):");
                numero = teclado.nextInt();
                if (numero == limiteI || numero == limiteS) {
                    igualLimite = true;
                }
                if (numero > limiteI && numero < limiteS) {
                    suma += numero;
                    dentro++;
                } else {
                    fuera++;
                }
            } while (numero != 0);

            System.out.println("La suma de los números dentro del intervalo es: " + suma);
            System.out.println("Hay " + dentro + " números dentro del intervalo.");
            System.out.println("Hay " + fuera + " números fuera del intervalo.");
            if (igualLimite) {
                System.out.println("Se ha introducido al menos un número igual a los límites del intervalo.");
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
