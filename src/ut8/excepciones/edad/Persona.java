package ut8.excepciones.edad;

import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Edad: ");
            int edad = Integer.parseInt(teclado.nextLine());

            if (edad < 0 || edad > 120) {
                throw new Exception("La Edad debe estar comprendida entre 0 y 120 anyos");
            }

            if (edad <= 16) {
                System.out.println("Edad escolar");
            }
            else if (edad <= 66) {
                System.out.println("Edd laboral");
            }
            else System.out.println("Jubilacion");
        } catch (NumberFormatException e) {
            System.out.println("Error: La Edad debe ser un numero: ");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
