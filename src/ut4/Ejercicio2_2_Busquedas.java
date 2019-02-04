package ut4;

import java.util.Scanner;

public class Ejercicio2_2_Busquedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int datos[] = {3, 6, 35, 15, 34, 12, 9, 46, 49, 6, 58, 64, 6, 97, 105, 64};
        int cont = 0;
        System.out.println("Dime un número para buscar: ");
        int num = teclado.nextInt();
        boolean sw = false;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == num) {
                System.out.printf("Encontrado en la posición %d.\n", i);
                sw = true;
            }
        }

        if (!sw) {
            System.out.println("No encontrado");
        }
    }
}
