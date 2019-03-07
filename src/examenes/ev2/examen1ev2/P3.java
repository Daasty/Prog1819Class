package examenes.ev2.examen1ev2;

import java.util.Scanner;

/**
 * CORREGIDO
 *
 * P3 EV2 Examen 1.
 * Array ordenado creciente. Pedir num a buscar al usr con primera posicion y repeteiciones.
 * Busqueda secuencial
 * @Daasty
 */
public class P3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int datos[] = {9, 12, 17, 17, 22, 24, 27, 38, 45, 48, 67, 76, 87 ,89, 95};

        System.out.println("Dime un valor para buscar en el array: ");
        int num = teclado.nextInt();
        boolean sw = false;

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Iteracion %d.\n", i + 1);

            if (num == datos[i]) {
                System.out.printf("Encontrado en la posicion %d\n", i);
                sw = true;
                break;
            }
            else if(num < datos[i]){
                break;
            }
        }

        if (!sw) {
            System.out.println("No encontrado en el vector.");
        }
    }
}