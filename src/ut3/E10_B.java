package ut3;

import java.util.Scanner;

/**
 *Preguntar el total de horas trabajadas a la semana para calcular el total a cobrar
 * 25e/hora hasta 40
 * Horas extra a 35e/hora
 * Añadiendo ventas para un incentivo a pagar:
 * Menos de 20000eur facturados son 140eur
 * Entre 20000 y 50000 son 350eur
 * Más de 50000 son 600 eur
 */
public class E10_B {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado?");
        int horas = Integer.parseInt(teclado.nextLine());
        System.out.println("Cuánto has vendido?");
        int vendido = Integer.parseInt(teclado.nextLine());

        int horasT, facturado;
        if (horas <= 40) {
            horasT = horas * 25;
        }
        else {
            horasT = 40 * 25 + (horas - 40) * 35;
        }

        if (vendido < 20000) {
            facturado = 140;
        }
        else if (vendido < 50000) {
            facturado = 350;
        }
        else facturado = 600;

        System.out.printf("Para las %d horas trabajadas, debes cobrar %d eur.\n", horas, horasT);
        System.out.printf("Además, sumando el incentivo de %d eur son %d eur.", facturado, horasT + facturado);
    }
}
