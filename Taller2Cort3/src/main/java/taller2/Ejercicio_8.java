
package taller2;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("El lado 1: ");
            int lado1 = teclado.nextInt();

            System.out.print("El lado 2: ");
            int lado2 = teclado.nextInt();

            System.out.print("El lado 3: ");
            int lado3 = teclado.nextInt();

            if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {

                System.out.print("SU TRIANGULO ES ISOCELES");

            } else if (lado1 == lado2 && lado2 == lado3) {

                System.out.print("SU TRIANGULO ES EQUILATERO");

            } else if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)
                    || Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2)
                    || Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2)) {

                System.out.println("Es un triángulo rectángulo");

            } else {

                System.out.print("El TRIANGULO ES ESCALENO");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
