package ut4;

import java.util.Scanner;

/**
 * Pedir valor al usuario a ver si está en un array con busqueda secuencial con valores ordenados
 */
public class Ejercicio2_1_2_Busquedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int datos[] = {3, 6, 10, 15, 34, 36, 45, 46, 49, 56, 58, 64, 72, 97, 105};
        int cont = 0;
        System.out.println("Dime un número para buscar: ");
        int num = teclado.nextInt();
        boolean sw = true;

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("¿%d = %d? --> ", datos[i], num);
            cont++;

            if (datos[i] != num) {
                System.out.printf("NO\n");
                if (datos[i] > num) {
                    break;
                }
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
        else System.out.println("Paramos el proceso. El valor no ha sido encontrado.");

        System.out.printf("Se han procesado %d elementos.", cont + 1);
    }
}