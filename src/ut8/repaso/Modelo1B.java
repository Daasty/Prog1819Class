package ut8.repaso;

import java.util.Scanner;

/**
 * Pedir dos numeros al usuarioy mostrar la suma
 */
public class Modelo1B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean sw1 = true, sw2 = true;

        do {
            try{
                System.out.println("Dime el primer numero: ");
                num1 = Integer.parseInt(teclado.nextLine());
                sw1 = false;
            }catch (NumberFormatException e) {
                System.out.println("Introduce un numero.");
            }catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }
        } while (sw1);

        do {
            try{
                System.out.println("Dime el segundo numero: ");
                num2 = Integer.parseInt(teclado.nextLine());
                sw2 = false;
            }catch (NumberFormatException e) {
                System.out.println("Introduce un numero.");
            }catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }
        } while (sw2);

        System.out.printf("La suma de ambos es: %d", num1 + num2);
    }
}
