package examenes.ev3.ev3Examen2.v2_01_15.p1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;

        do {
            try {
                System.out.println("Dime un numero entre 1 y 25:");
                int num = Integer.parseInt(teclado.nextLine());

                if (num < 1 || num > 25) {
                    throw new Exception("Entre 1 y 25 dije, copon.");
                }

                int aux = num;

                for (int i = 1; i < num; i++) {
                    aux *= i;
                }

                System.out.printf("El factorial de %d es %d\n", num, aux);

                sw = false;

            } catch (NumberFormatException e) {
                System.out.println("Introduce un numero.");
            } catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }
        } while (sw);
    }
}
