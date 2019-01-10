package ut3;

import java.util.Scanner;

/**
 *Preguntar el total de horas trabajadas a la semana para calcular el total a cobrar
 * 25e/hora hasta 40
 * Horas extra a 35e/hora
 */
public class E10_A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado?");
        int horas = Integer.parseInt(teclado.nextLine());
        int horasT;
        if (horas <= 40) {
            horasT = horas * 25;
        }
        else {
            horasT = 40 * 25 + (horas - 40) * 35;
        }

        System.out.printf("Para las %d horas trabajadas, debes cobrar %d eur.", horas, horasT);
    }
}
