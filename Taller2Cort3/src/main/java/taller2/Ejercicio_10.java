
package taller2;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escriba el tipo de uvas que quiere (A/B):");
            String tipo = teclado.nextLine();

            System.out.print("Escriba el tamaño de uvas que quiere (1/2):");
            int tamaño = teclado.nextInt();

            System.out.print("Escriba la cantidad de kilos entregados: ");
            double kilos = teclado.nextDouble();

            double precioInicial;
            if (tipo.equals("A")) {
                precioInicial = 0.5;
            } else if (tipo.equals("B")) {
                precioInicial = 0.3;
            } else {
                System.out.println("Tipo de uva inválido.");
                return;
            }

            if (tamaño == 1) {
                precioInicial += 0.2;
            } else if (tamaño == 2) {
                precioInicial += 0.3;
            } else {
                System.out.println("Tamaño de uva inválido.");
                return;
            }

            if (tipo.equals("B")) {
                if (tamaño == 1) {
                    precioInicial -= 0.3;
                } else {
                    precioInicial -= 0.5;
                }
            }

            double precioTotal = kilos * precioInicial;

            System.out.println("El precio total sera :" + precioTotal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
