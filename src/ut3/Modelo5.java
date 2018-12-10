package ut3;

import java.util.Scanner;

/**
 * Mostrar 30 veces una cadena que hay que pedir al usuario
 */
public class Modelo5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una cadena para repetir: ");
        String cadena = teclado.nextLine();

        for (int i = 0; i < 30; i++) {
            System.out.println((i + 1) + " -> " + cadena);
        }
    }
}
