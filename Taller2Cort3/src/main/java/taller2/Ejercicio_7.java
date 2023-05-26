
package taller2;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba el punto en X y el punto en Y:");
            double x1 = teclado.nextDouble();
            double y1 = teclado.nextDouble();

            System.out.print("Escriba el radio de la circunferencia: :");
            double r1 = teclado.nextDouble();

            System.out.print("Escriba el punto en X2 y el punto en Y2 :");
            double x2 = teclado.nextDouble();
            double y2 = teclado.nextDouble();

            System.out.print("Escriba el radio de la circunferencia: :");
            double r2 = teclado.nextDouble();

            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (distancia > r1 + r2) {
                System.out.println("Las circunferencias son exteriores.");
            } else if (distancia == r1 + r2) {
                System.out.println("Las circunferencias son tangentes exteriores.");
            } else if (distancia < Math.abs(r1 - r2)) {
                System.out.println("Las circunferencias son interiores.");
            } else if (distancia == Math.abs(r1 - r2)) {
                System.out.println("Las circunferencias son tangentes interiores.");
            } else if (distancia == 0 && r1 == r2) {
                System.out.println("Las circunferencias son concéntricas.");
            } else {
                System.out.println("Las circunferencias son secantes.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}


    