package ut3;

import java.util.Scanner;

/**
 * Pedir un número para decir cuántos bits son necesarios para representarlo
 */
public class Reto1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Dime un número: ");
            num = Integer.parseInt(teclado.nextLine());
        }while(num < 0);

        int cont = 1;

        while(num / 2 != 0) {
            cont++;
            num /=2;
        }

        System.out.println("Se necesitan " + cont + " bits");
    }
}
