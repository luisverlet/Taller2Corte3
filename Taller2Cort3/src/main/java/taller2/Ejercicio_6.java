
package taller2;

import java.util.Scanner;


public class Ejercicio_6 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba su edad: ");
            int edad = teclado.nextInt();

            System.out.print("escriba su nota: ");
            double nota = teclado.nextDouble();

            System.out.print("Escriba su sexo (M=Masculino/F=Femenino): ");
            char sexo = teclado.next().charAt(0);

            if (nota >= 5 && edad >= 18) {

                if (sexo == 'M') {
                    System.out.println("POSIBLE");
                } else if (sexo == 'F') {
                    System.out.println("ACEPTADA");
                } else {
                    System.out.println("NO ACEPTADA");
                }
            } else {
                System.out.println("NO ACEPTADA");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
