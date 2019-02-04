package ut4;

import java.util.Scanner;

/**
 * Pedir valor al usuario a ver si está en un array con busqueda secuencial con valores desordenados
 */
public class Ejercicio2_1_1_Busquedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int datos[] = {32, 3, 21, 24, 3, 45, 43, 21, 65, 4, 32, 45, 13, 32, 14, 9};
        int cont = 0;
        System.out.println("Dime un número para buscar: ");
        int num = teclado.nextInt();
        boolean sw = true;

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("¿%d = %d? --> ", datos[i], num);
            cont++;

            if (datos[i] != num) {
                System.out.printf("NO\n");
            }
            else {
                System.out.printf("SÍ\n");
                sw = false;
                break;
            }
        }

        if (!sw) {
            System.out.printf("Encontrado en la posición %d.\n", cont);
        }
        else System.out.println("No encontrado.");

        System.out.printf("Se han procesado %d elementos.", cont + 1);
    }
}
