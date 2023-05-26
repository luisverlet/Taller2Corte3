
package taller1;

import java.util.Scanner;


public class Ejercicio_8 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            boolean detenido = true;
            int horas = 0, minutos = 0, segundos = 0;

            System.out.println("Presione Enter para detener el cronómetro.");

            while (detenido) {
                try {
                    Thread.sleep(1000);
                    segundos++;
                    if (segundos == 60) {
                        segundos = 0;
                        minutos++;
                        if (minutos == 60) {
                            minutos = 0;
                            horas++;
                        }
                    }
                    System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
                    if (System.in.available() > 0) {
                        String entrada = teclado.nextLine();
                        if (entrada.equals("")) {
                            detenido = false;
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Cronómetro detenido.");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
