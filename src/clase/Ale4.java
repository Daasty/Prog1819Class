package clase;

import java.util.Scanner;

/**
 * Programa que pida un caracter al usuario para mostrar en pantalla de los siguientes mensajes
 * Soy un signo de interrogacion
 * Soy un signo de adminarion
 * Soy un signo aritmetico
 * Soy una vocal
 * Soy otro caracter
 */
public class Ale4 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un caracter para mostrar un mensaje");
        char caract = teclado.nextLine().trim().toLowerCase().charAt(0);

        switch (caract) {
            case '?':
            case '¿':
                System.out.println("Soy un símbolo de interrogación");
                break;
            case '!':
            case '¡':
                System.out.println("Soy un símbolo de exclamación");
                break;
            case '+':
            case'-':
            case'/':
            case'*':
                System.out.println("Soy un signo aritmético");
                break;
            case 'a':
            case'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Soy una vocal");
                break;

                default:
                    System.out.println("Soy otro símbolo");
        }
    }
}
