package ut3;

import java.util.Scanner;

/**
 * Programa que pida la altura y el peso al usuario para mostrar el IMC.
 * IMC -> IMC = peso/altura^2
 * Indicar si el peso es ideal o no, que es entre 18 y 25.
 */
public class E1 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu altura en metros: ");
        double altura = Math.pow(Double.parseDouble(teclado.nextLine()), 2);

        System.out.println("Dime el peso en kg: ");
        double peso = teclado.nextDouble();

        double imc = peso / altura;

        System.out.printf("Tu IMC es %f \n", imc);
        if (imc > 18 && imc < 25) {
            System.out.println("Tu IMC es adecuado.");
        }
    }
}
