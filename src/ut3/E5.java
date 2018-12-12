package ut3;

import java.util.Scanner;

/**
 * Programa que pida edades al usuario hasta que indique que no quiere continuar
 * Mostrar la edad máxima, mínima y la media
 * Total de personas con más de 30 años
 */
public class E5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime edades hasta que no quieras.");
        int edad = Integer.parseInt(teclado.nextLine());

        char resp = 's';
        int max = edad, min = edad, media = edad, cont = 1, cont2 = 0;

        do{
            System.out.println("Dime más edades: ");
            edad = teclado.nextInt();

            if (edad < min) {
                min = edad;
            }
            if (edad > max) {
                max = edad;
            }
            media += edad;

            while (cont2 == 2) {
                System.out.println("Quieres continuar? (s/n)");
                resp = teclado.next().toLowerCase().trim().charAt(0);
                cont2 = 0;
                break;
            }
            cont2++;
            cont++;

        } while (resp =='s');

        media = media / cont;
        System.out.printf("La edad máxima es %d, la mínima %d, la media es %d. Con más de 30 son %d.", max, min, media, cont);
    }

}
