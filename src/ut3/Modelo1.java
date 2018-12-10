package ut3;

import java.util.Scanner;

/*
Pedir dos números al usuario para mostrar el resultado de sumarlos
 */
public class Modelo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el primer número: ");
        int num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Dime el segundo número: ");
        int num2 = Integer.parseInt(teclado.nextLine());

        int numSuma = num1 + num2;
        System.out.println("La suma de ambos números es " + numSuma);
    }
}
