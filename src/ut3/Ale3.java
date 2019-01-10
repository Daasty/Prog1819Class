package ut3;

import java.util.Scanner;

/**
 * Programa que pida nombres de personas para saludarles hasta que el usuario indique que no desea continuar
 */
public class Ale3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char resp;
        int cont = 0;

        do {
            System.out.println("Dime nombres de personas: ");
            String nombre =  teclado.nextLine();
            cont++;

            System.out.println("Quieres continuar?(s/n)");
            resp = teclado.nextLine().trim().toLowerCase().charAt(0);
        } while (resp == 's');

        System.out.printf("Se han preguntado a %d personas", cont);

    }
}
