
package taller2;

import java.util.Scanner;


public class Ejercicio_13 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba el resultado obtenido al lanzar el dado: ");
            int resultado = teclado.nextInt();

            if (resultado < 1 || resultado > 6) {
                System.out.println("ERROR: número incorrecto");

                return;
            }

            int caraOpuesta;
            if (resultado == 1) {
                caraOpuesta = 6;
            } else if (resultado == 2) {
                caraOpuesta = 5;
            } else if (resultado == 3) {
                caraOpuesta = 4;
            } else if (resultado == 4) {
                caraOpuesta = 3;
            } else if (resultado == 5) {
                caraOpuesta = 2;
            } else {
                caraOpuesta = 1;
            }

            System.out.println("La cara opuesta al resultado obtenido es: " + caraOpuesta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
