package ut8.repaso;

import java.util.Scanner;

/**
 * Pedir un numero entero al usuario para mostrar en pantalla si es positivo, negativo o cero
 */
public class Modelo1A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;
        do {
            try{
                System.out.println("Dime un numero: ");
                int num = Integer.parseInt(teclado.nextLine());

                if (num == 0) {
                    System.out.println("Es cero");
                }
                else if (num > 0) {
                    System.out.println("Es positivo");
                }
                else System.out.println("Es negativo");
                sw = false;

            }catch (NumberFormatException e) {
                System.out.println("Mal >");
                e.printStackTrace();
            }catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }
        } while (sw);

    }
}
