package ut8;

import java.util.Scanner;

/**
 * Pide un numero entero al usuario para responder si es positivo, negativo o cero
 */
public class Modelo1a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;

        do {
            sw = true;
            try{
                System.out.println("Dime un numero entero:");
                int num = Integer.parseInt(teclado.nextLine());

                if (num > 0) {
                    System.out.println("Es positivo");
                }
                else if (num < 0) {
                    System.out.println("Es negativo");
                }
                else System.out.println("Es cero");

                sw = false;
            } catch(NumberFormatException e) {
                System.out.println("Debes introducir un numero.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (sw);
    }
}
