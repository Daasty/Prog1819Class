package ut8.repaso.edades;

import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;

        do {
            try {
                System.out.println("Dime edades: ");
                int edad = Integer.parseInt(teclado.nextLine());
                if (edad < 0 || edad > 120) throw new Exception("Edad entre 0 y 120");

                if (edad <= 16) {
                    System.out.println("Edad escolar.");
                }
                else if (edad <= 66) {
                    System.out.println("Edad laboral.");
                }
                else System.out.println("Jubilacion");
                sw = false;
            }catch (NumberFormatException e) {
                System.out.println("La Edad debe ser un numero");
            } catch (Exception e) {
                System.out.println("Error >" + e.getMessage());
            }
        } while (sw);
    }
}
