
package taller2;

import java.util.Scanner;


public class Ejercicio_16 {

    public static void main(String[] args) {
        try {
            Scanner teclado= new Scanner(System.in);
            double peso, costo;
            int zona;

            System.out.print("Escriba el peso del paquete (en kg): ");
            peso = teclado.nextDouble();

            if (peso > 5) {
                System.out.println("Lo sentimos, no se pueden transportar paquetes de más de 5kg.");
            } else {
                System.out.println("Escriba la zona a la que va dirigido el paquete:");
                System.out.println("1. América del Norte");
                System.out.println("2. América Central");
                System.out.println("3. América del Sur");
                System.out.println("4. Europa");
                System.out.println("5. Asia");
                zona = teclado.nextInt();

                if (zona == 1) {
                    costo = peso * 24.00;
                    System.out.println("El costo del envío es de " + costo + " euros.");
                } else if (zona == 2) {
                    costo = peso * 20.00;
                    System.out.println("El costo del envío es de " + costo + " euros.");
                } else if (zona == 3) {
                    costo = peso * 21.00;
                    System.out.println("El costo del envío es de " + costo + " euros.");
                } else if (zona == 4) {
                    costo = peso * 10.00;
                    System.out.println("El costo del envío es de " + costo + " euros.");
                } else if (zona == 5) {
                    costo = peso * 18.00;
                    System.out.println("El costo del envío es de " + costo + " euros.");
                } else {
                    System.out.println("La zona ingresada es inválida.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
