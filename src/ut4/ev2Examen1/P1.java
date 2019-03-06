package ut4.ev2Examen1;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner teclado = new Scanner(System.in);

        int[] numeros = {1, 6, 7, 8, 9, 10, 15, 17, 18, 20, 25, 30};
        //int numeros[] = {34, 5, 4, 1, 23, 2, 32, 4, 45, 3, 2 , 98, 5, 6};
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("buscar");
        int buscar = Integer.parseInt(teclado.nextLine());

        int izq = 0;
        int der = numeros.length - 1;
        boolean sw = false;

        while (izq <= der) {
            int centro = (der + izq) / 2;

            if (numeros[centro] == buscar) {
                sw = true;
                break;
            } else if (numeros[centro] < buscar) {
                izq = centro + 1;
            } else {
                der = centro - 1;
            }
        }

        if (sw) {
            System.out.println("El numero " + buscar + " SE encuentra en el vector");
        } else {
            System.out.println("El numero " + buscar + " NO se encuentra en el vector");
        }

    }

}
