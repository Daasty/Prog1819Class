package ut3.bucles_anidados;

import java.util.Scanner;

/**
 * Pedir cadena al usuario para mostrar N veces (N mayor que 0 y pedir al usr).
 * Repetir hasta que desee que no quiere continuar
 */
public class Programa3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una cadena para repetir: ");
        String cadena = teclado.nextLine();

        System.out.println("Cuántas veces quieres repetir la cadena?");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < num; i++) {
            if (false) {

            }
            System.out.printf("%s \n", cadena);

            if (i == num - 1) {
                System.out.println("Deseas continuar? (s/n)");
                char valor = teclado.nextLine().trim().toLowerCase().charAt(0);
                if (valor == 's') {
                    i = -1;
                }
            }
        }

    }
}
