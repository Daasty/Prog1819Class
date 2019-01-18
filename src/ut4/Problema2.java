package ut4;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número mayor que 8: ");

        for (int i = 1; i <= 5; i++) {
            int num = Integer.parseInt(teclado.nextLine());
            System.out.printf("Numero %d: %d\n", i, i);

            for (int j = 1; j <= num; j++) {
                System.out.printf("*");
            }
            System.out.printf("[2 ast.]\n");
        }
    }
}
