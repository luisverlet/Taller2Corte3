
package taller1;

import java.util.Random;


public class Ejercicio_14 {

    public static void main(String[] args) {

        try {
            int[][] numeros = new int[4][5];
            Random aleatorio = new Random();
            int sumaTotal = 0;

            for (int fila = 0; fila < numeros.length; fila++) {
                for (int columna = 0; columna < numeros[fila].length; columna++) {
                    numeros[fila][columna] = aleatorio.nextInt(900) + 100;
                }
            }

            for (int fila = 0; fila < numeros.length; fila++) {
                int sumaFila = 0;
                for (int columna = 0; columna < numeros[fila].length; columna++) {
                    sumaFila += numeros[fila][columna];
                }
                numeros[fila][4] = sumaFila;
            }

            for (int columna = 0; columna < numeros[0].length; columna++) {
                int sumaColumna = 0;
                for (int fila = 0; fila < numeros.length; fila++) {
                    sumaColumna += numeros[fila][columna];
                }
                numeros[3][columna] = sumaColumna;
                numeros[3][columna] = sumaColumna;
            }

            for (int fila = 0; fila < numeros.length; fila++) {
                sumaTotal += numeros[fila][4];
            }

            for (int fila = 0; fila < numeros.length; fila++) {
                for (int columna = 0; columna < numeros[fila].length; columna++) {
                    System.out.print(numeros[fila][columna] + "\t");
                }
                System.out.println();
            }
            System.out.println("Suma total: " + sumaTotal);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
