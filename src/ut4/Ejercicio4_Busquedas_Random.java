package ut4;

import java.util.Random;
import java.util.Scanner;

/**
 *Llenar array por código. Rellenar con números aleatorios entre 100 y 200.
 * Pedir al usr un intervalo para mostrar una lista de posiciones del array fuera del intervalo
 */
public class Ejercicio4_Busquedas_Random {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner teclado = new Scanner(System.in);

        int datos[] = {34, 43, 21, 16, 45, 23, 17, 76, 68, 34, 43, 21, 10, 8, 79};
        int num = 0, temp = 0;

        System.out.println("Dime el primer número del intervalo: "); //Pedimos el intervalo al usuario
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime el segundo número del intervalo: ");
        int num2 = Integer.parseInt(teclado.nextLine());

        if (num2 < num1) { //Nos aseguramos de que el intervalo va de menos a más
            temp = num2;
            num2 = num1;
            num1 = temp;
        }

        System.out.printf("Números fuera del intervalo(%d-%d): \n", num1, num2);

        for (int i = 0; i < datos.length; i++) { //Recorremos el bucle que genera los random, los coloca y comprueba el intervalo
            num = 100 + rnd.nextInt(101);
            datos[i] = num;
            if (datos[i] < num1 || datos[i] > num2) {
                System.out.printf("%d, ", datos[i]);
            }
        }
    }
}
