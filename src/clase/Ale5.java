package clase;

import java.util.Scanner;
public class Ale5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = {12, 13, -4, 5, 18, 12, -4, 18, 12, 12};

        //Búsqueda secuencial en un array según una condición

        System.out.print("Buscar: ");
        int buscar = Integer.parseInt(teclado.nextLine());

        boolean sw = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == buscar) {
                if (!sw) {
                    System.out.println("Encontrado en: " + i);
                }
                sw = true;
            }
            if (!sw) {
                System.out.println("No encontrado");
            }
        }
    }
}
