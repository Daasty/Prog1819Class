package ut4;

import java.util.Scanner;

public class Ejercicio2_3_Busquedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int datos[] = {3, 6, 10, 15, 34, 36, 45, 46, 46, 49, 56, 58, 64, 72, 97, 105};
        int cont = 0;
        System.out.println("Dime un número para buscar: ");
        int num = teclado.nextInt();
        boolean sw = false;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == num) {
                System.out.printf("Encontrado en la posición %d.\n", i);
                sw = true;

            }
            if (datos[i] > num) {
                break;
            }
        }

        if (!sw) {
            System.out.println("No encontrado");
        }
    }
}
