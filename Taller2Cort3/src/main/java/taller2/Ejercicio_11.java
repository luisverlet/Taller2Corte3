
package taller2;

import java.util.Scanner;


public class Ejercicio_11 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            int alumnos = 0;
            double costoPorAlumno = 0;
            double total = 0;

            System.out.print("Escriba la cantidad de alumnos que van asistir: ");
            alumnos = teclado.nextInt();

            if (alumnos >= 100) {

                costoPorAlumno = 65;

            } else if (alumnos >= 50) {

                costoPorAlumno = 70;

            } else if (alumnos >= 30) {

                costoPorAlumno = 95;

            } else {

                total = 4000;

            }
            if (costoPorAlumno > 0) {
                total = alumnos * costoPorAlumno;
            }

            System.out.println("El costo pro alumno del viaje sera de : " + costoPorAlumno + "Euros");
            System.out.println("El costo total del viaje sera de : " + total + "Euros");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
