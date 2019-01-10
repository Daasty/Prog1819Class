package ut3;

import java.util.Scanner;

/**
 * Programa que pida al usuario letras hasta que indique que no quiere continuar para mostrar el número de
 * A, E, I, O, U que se han introducido
 * Independientemente de mayúsculas o minúsculas
 */
public class E6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime letras hasta que no quieras seguir: ");

        char resp;
        char letra;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        do {
            System.out.println("Dime letras y las contaré: ");
            letra = teclado.nextLine().toLowerCase().trim().charAt(0);

            switch (letra) {
                case 'a': a++;
                break;
                case 'e': e++;
                break;
                case 'i': i++;
                break;
                case 'o': o++;
                break;
                case 'u': u++;
                break;
            }

            System.out.println("Quieres continuar? (s/n)");
            resp = teclado.nextLine().toLowerCase().trim().charAt(0);
        }while (resp == 's');

        System.out.printf("Se han introducido %d 'A', %d 'E', %d 'I', %d 'O', %d 'U'", a, e, i, o ,u);
    }
}
