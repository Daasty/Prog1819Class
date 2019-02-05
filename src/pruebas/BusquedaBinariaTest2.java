package pruebas;
import java.util.Scanner;

/**
 * Búsqueda de un número en un array rellenado por código por búsqueda binaria
 */
public class BusquedaBinariaTest2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int datos[] = {6, 8, 12, 23, 26, 29, 34, 46, 54, 57, 59, 78, 83, 99, 110};

        System.out.println("Dime un número a buscar: ");

        int num = teclado.nextInt();

        int izq = 0;
        int der = datos.length;
        boolean sw = false;

        while(izq <= der) {
            int centro = (izq + der) / 2;

            if (datos[centro] == num) {
                sw = true;
                break;
            }
            else if (datos[centro] < num) {
                izq = centro + 1;
            }
            else der = centro - 1;
        }


        if (sw) {
            System.out.println("Encontrado.");
        }
        else System.out.println("No encontrado");
    }
}

/*
int der = datos.length - 1;
        int izq = 0;
        boolean sw = false;

        while(izq <= der) {
            int centro = (izq + der) / 2;

            if (datos[centro] == num) {
                sw = true;
                break;
            }
            else if (datos[centro] < num) {
                izq = centro + 1;
            }
            else der = centro - 1;
        }

 */

