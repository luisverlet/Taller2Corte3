
package taller1;

import java.util.Scanner;


public class Ejercicio_7 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba el total de la compra:");
            int totalVenta = teclado.nextInt();

            System.out.print("Escriba el pago mensual:");
            int pagoMensual = teclado.nextInt();

            int pagoTotal = totalVenta / pagoMensual;

            System.out.println("La cantidad que va a pagar sera de : " + pagoTotal + " Pesos");

            double total = 0;
            double pago = 10;

            for (int i = 0; i < pagoMensual; i++) {
                total += pago;
                pago *= 2;
            }
            System.out.printf("El total a pagar después de los %d meses es: %.2f$\n", pagoMensual, total);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}

