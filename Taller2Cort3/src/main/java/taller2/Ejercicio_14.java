
package taller2;

import java.util.Scanner;


public class Ejercicio_14 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba un numero de 1 a 7: ");
            int numero = teclado.nextInt();

            if (numero < 1 || numero > 7) {

                System.out.print("Escriba un numero que sea valido");

            }

            if (numero == 1) {

                System.out.print("El numero que ingresaste " + numero + "Sera el dia lunes");

            } else if (numero == 2) {

                System.out.print("El numero que ingresaste " + numero + "Sera el dia martes");

            } else if (numero == 3) {

                System.out.print("El numero que ingresaste " + numero + "Sera el dia miercoles");

            } else if (numero == 4) {

                System.out.print("El numero que ingresaste " + numero + "Sera el dia jueves");

            } else if (numero == 5) {

                System.out.print("El numero que ingresaste " + numero + "Sera el dia viernes");

            } else if (numero == 6) {

                System.out.print("El numero que ingresaste " + numero + "Sera el dia sabado");

            } else if (numero == 7) {

                System.out.print("El numero que ingresaste " + numero + "Sera el dia domingo");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
