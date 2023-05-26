
package taller1;

import java.util.Scanner;


public class Ejercicio_13 {

    public static void main(String[] args) {

        try {
            int[][] matriz = new int[4][5];
            int[] sumasFilas = new int[4];
            int[] sumasColumnas = new int[5];
            int sumaTotal = 0;

            Scanner teclado= new Scanner(System.in);

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("Escriba un número: ");
                    matriz[i][j] = teclado.nextInt();
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    sumasFilas[i] += matriz[i][j];
                    sumasColumnas[j] += matriz[i][j];
                    sumaTotal += matriz[i][j];
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.print(sumasFilas[i] + "\n");
            }
            for (int i = 0; i < 5; i++) {
                System.out.print(sumasColumnas[i] + "\t");
            }
            System.out.print(sumaTotal + "\n");
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
