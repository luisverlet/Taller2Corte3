
package taller2;

import java.util.Scanner;


public class Ejercicio_12 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba la duracion de la llamada en minutos: ");
            int duracion = teclado.nextInt();

            System.out.print("Escriba el día de la semana (lunes a domingo): ");
            String dia = teclado.next().toLowerCase();

            System.out.print("Escriba el turno (mañana o tarde): ");
            String turno = teclado.next().toLowerCase();

            double costo = 0;

            if (duracion <= 5) {

                costo = duracion * 1.0;

            } else if (duracion <= 8) {

                costo = 5 + (duracion - 5) * 0.8;

            } else if (duracion <= 10) {

                costo = 7.4 + (duracion - 8) * 0.7;

            } else {

                costo = 8.8 + (duracion - 10) * 0.5;

            }

            double impuesto = 0;
            if (dia.equals("domingo")) {
                impuesto = costo * 0.03;
            } else if (turno.equals("mañana")) {
                impuesto = costo * 0.15;
            } else {
                impuesto = costo * 0.1;
            }

            double total = costo + impuesto;
            System.out.println("El costo total de la llamada es de " + total + " euros.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
