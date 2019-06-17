package ut8.excepciones.edad;

import java.util.Scanner;

public class MainClaseEdad {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Edad: ");
            int edad = Integer.parseInt(teclado.nextLine());

           Edad e = new Edad(edad);
            System.out.println(e.clasificar());

        } catch (NumberFormatException e) {
            System.out.println("Error: La Edad debe ser un numero: ");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
