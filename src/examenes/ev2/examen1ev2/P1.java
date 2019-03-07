package examenes.ev2.examen1ev2;


import java.util.Scanner;

/**
 * CORREGIDO
 *
 * EV2 Examen 1.
 * Pedir del 1 al 9 al usr, para mostrar una figura con numeros.
 * @Daasty
 */
public class P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 9: ");
        int num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j % 2 != 0) { //Si j es diferente de 0, imprimirá sólo i
                    System.out.printf("%d", i);
                } // Si no imprimirá i + 1
                else System.out.printf("%d", (i + 1));
            }
            System.out.println();
        }
    }
}
