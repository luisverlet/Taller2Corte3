
package taller2;

import java.util.Scanner;


public class Ejercicio_1 {

    
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba el numero :");
            double numero1 = teclado.nextDouble();

            System.out.print("Escriba el siguiente numero :");
            double numero2 = teclado.nextDouble();

            if (numero1 > numero1) {

                System.out.print("El primer numero es mayor que el segundo numero ");

            }
            if (numero1 == numero2) {

                System.out.print("Los numeros ingresados son iguales ");

            } else {

                System.out.print("El segudno numero es mayor que el primer numero ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
