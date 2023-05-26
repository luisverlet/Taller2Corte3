
package taller2;

import java.util.Scanner;


public class Ejercicio_4 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite la cadena de texto: ");
            String palabra = teclado.nextLine();

            boolean hayMayuscula = false;
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                if (Character.isUpperCase(letra)) {
                    hayMayuscula = true;
                    System.out.println(letra + " es una letra mayúscula");
                }
            }

            if (!hayMayuscula) {
                System.out.println("No se encontraron letras mayúsculas.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

