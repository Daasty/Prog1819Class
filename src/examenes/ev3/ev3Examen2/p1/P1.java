package examenes.ev3.ev3Examen2.p1;

import java.awt.font.NumericShaper;
import java.util.Scanner;

/**
 * Numero entero entre 1 y 10 al usuario par mostrar en pantalla la tabla de multiplicar de dicho numero. Formato: 3 x 2 = 6
 */
public class P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;
        int num = 0;
        do {
            try {
                System.out.println("Dime un numero para multiplicar");
                num = Integer.parseInt(teclado.nextLine());
                if (num >= 1 && num <= 10) {
                    sw = false;
                }
                else throw new Exception("Introduce un numero entre 1 y 10");

            }catch (NumberFormatException e) {
                System.out.println("Introduce un numero");
            }catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }
        }while(sw);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %2d = %2d\n", i, num, i * num);
        }
    }

}
