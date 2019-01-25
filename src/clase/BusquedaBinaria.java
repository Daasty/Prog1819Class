package clase;

import java.util.Scanner;

/**
 * Haz un programa que busque utilizando el algoritmo de busqueda binaria un numero en un vector conocido.
 */

public class BusquedaBinaria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int[] datos = {1, 4, 5, 8, 12, 15, 18, 19, 21, 22, 34, 43, 48, 52, 56, 89, 90};

        System.out.println("Buscar: ");

        int buscar = Integer.parseInt(teclado.nextLine());
        int swPos = -1;
        int izq = 0; int der =  datos.length - 1;
        int centro = (izq + der) / 2;

        while(izq <= der) {

            if (datos[centro] == buscar) {
                swPos = centro;
                System.out.println("Posición encontrado el valor en la posición " + centro);
                break;
            }
            else if (datos[centro] > buscar) {
                izq = centro +1;
            }
            else {
                der = centro -1;
            }
        }

        if (swPos < 0) {
            System.out.println("Posición no encontrada");
        }
    }
}
