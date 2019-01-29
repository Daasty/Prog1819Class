package clase;

import java.util.Scanner;

/**
 * Haz un programa que busque utilizando el algoritmo de busqueda binaria un numero en un vector conocido.
 */

public class BusquedaBinaria2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int[] datos = {1, 4, 5, 8, 12, 15, 18, 19, 21, 22, 34, 43, 48, 52, 56, 89, 90};

        System.out.println("Buscar: ");

        int buscar = Integer.parseInt(teclado.nextLine());
        int swPos = -1;
        int izq = 0; int der =  datos.length - 1;
        int cont = 1;

        while(izq <= der) {
            int centro = (izq + der) / 2;
            System.out.printf("Vuelta %d: [%d, %d]\n", cont++, izq, der);
            System.out.printf("  > Centro: %d\n", centro);



            if (datos[centro] == buscar) {
                swPos = centro;
                System.out.println("Posición encontrado el valor en la posición " + (centro + 1));
                break;
            }
            else if (buscar < datos[centro]) {
                System.out.printf("  > %d == %d ? NO ---> ", datos[centro], buscar);
                System.out.printf("%d > %d? SÍ, cambio derecha\n", der, izq);
                der = centro - 1;
            }
            else {
                System.out.printf("  > %d == %d ? NO ---> ", datos[centro], buscar);
                System.out.printf("%d > %d? NO, cambio izquierda\n", izq, der);
                izq = centro + 1;
            }
        }

        if (swPos < 0) {
            System.out.printf("Posición no encontrada > [%d, %d]", izq, der);
        }
    }
}
