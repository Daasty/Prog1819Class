package ut3;

import java.util.Scanner;

/**
 * Pedir al usuario un número para mostrar su factorial con este formato:
 * 5! = 1x2x3x4x5 = 120
 */

public class E8 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te diré el factorial: ");
        int num = Integer.parseInt(teclado.nextLine());
        System.out.printf("%d! = 1", num);
        int res = 1;

        for (int i = 1; i < num; i++) {
            System.out.printf("x%d", i + 1);
            res = res * (i + 1);
        }

        System.out.printf(" = %d", res);
    }
}
