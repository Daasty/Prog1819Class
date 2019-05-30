package ut8.excepciones.entero;

import java.util.Scanner;

public class Entero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean swError = true;

        do {
            try {
                System.out.println("Dime un num entero: ");
                int num = Integer.parseInt(teclado.nextLine());

                if (num < 0) {
                    System.out.println("Num negativo");

                } else if (num > 0) {
                    System.out.println("Num positivo");

                } else System.out.println("Num es cero");

                swError = false;

            } catch (NumberFormatException e) {
                //Error en la conversion
                System.out.println("Debes introducir un numero valido.");

            } catch (Exception e) {
                //Para otro tipo de error
                System.out.println("DAM1 > " + e.getMessage());
                e.printStackTrace();
            }

        } while (swError);

        System.out.println();


    }
}
