package examenes.external.ev2Examen2;

import java.util.Scanner;

/**
 * Pedir valor al usuario para indicar en pantalla si se encuentra o no almacenado en el vector de enteros cargado con datos y ordenado de forma CRECIENTE
 * Búsqueda binaria o dicotómica
 */
public class P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int datos[] = {3, 6, 8, 10, 14, 18, 22, 26, 34, 35, 38, 39, 42, 45, 49, 52, 65, 68, 69};

        System.out.println("Dime un número para buscar en el array: ");
        int num = Integer.parseInt(teclado.nextLine());

        int der = datos.length;
        int izq = 0;
        boolean sw = true;

        while (izq <= der) {
            int centro = (der + izq) / 2;

            if (num == datos[centro]) {
                System.out.println("Encontrado en " + centro);
                sw = false;
                break;
            }
            else if (num < datos[centro]) {
                der = centro - 1;
            }
            else  {
                izq = centro + 1;
            }
        }

        if (sw) {
            System.out.println("No encontrado.");
        }
    }
}
