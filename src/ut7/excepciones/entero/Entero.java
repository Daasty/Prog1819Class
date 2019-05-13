package ut7.excepciones.entero;

import java.util.Scanner;

public class Entero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un num entero: ");
        int num = Integer.parseInt(teclado.nextLine());

        if(num < 0) {
            System.out.println("Num negativo");
        }
        else if (num > 0) {
            System.out.println("Num positivo");
        }
        else System.out.println("Num es cero");
    }
}
