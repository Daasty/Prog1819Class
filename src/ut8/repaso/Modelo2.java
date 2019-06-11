package ut8.repaso;

import java.util.Scanner;

/**
 * Pedir edad para indicar si es o no mayor de edad
 */
public class Modelo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;

        do {
            try{
                System.out.println("Dime una edad: ");
                int edad = Integer.parseInt(teclado.nextLine());
                if (edad >= 0 && edad <= 120) {
                    if (edad >= 18) {
                        System.out.println("Es mayor de edad.");
                    }
                    else System.out.println("No es mayor de edad.");
                    sw = false;
                }
                else throw new Exception("Introduce una edad entre 0 y 120");
            }catch (NumberFormatException e) {
                System.out.println("Introduce un numero");
            }
            catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }
        }while(sw);
    }
}
