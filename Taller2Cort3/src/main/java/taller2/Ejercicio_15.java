
package taller2;

import java.util.Scanner;


public class Ejercicio_15 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba un número del 1 al 12 para conocer la cantidad de días del mes correspondiente: ");
            int mes = teclado.nextInt();

            if (mes == 2) {
                System.out.println("Febrero tiene 28 o 29 días, dependiendo del año.");
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println("El mes " + mes + " tiene 30 días.");
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("El mes " + mes + " tiene 31 días.");
            } else {
                System.out.println("Número de mes inválido.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
