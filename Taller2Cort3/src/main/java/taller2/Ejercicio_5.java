
package taller2;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        try {
            Scanner teclado= new Scanner(System.in);

            System.out.print("Escriba el número base: ");
            double base = teclado.nextDouble();
            System.out.print("Escriba el exponente: ");
            int exponente = teclado.nextInt();

            double resultado = 0;
            switch (exponente) {
                case 0:
                    resultado = 1;
                    break;
                case 1:
                    resultado = base;
                    break;
                default:
                    if (exponente > 1) {
                        resultado = Math.pow(base, exponente);
                    } else {
                        resultado = 1 / Math.pow(base, -exponente);
                    }
                    break;
            }

            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
