package ut3;

import java.util.Scanner;

/**
 * Descuento dependiendo de la compra que se haga
 * 5% para compras menores de 100e
 * 10% para compras entre 100 y 400
 * 25% para más de 400e
 * Pedir el importe para mostrar el total a cobrar y el descuento aplicado en porcentaje
 */

public class E4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuánto has comprado y te diré el descuento: ");
        double gastado = Double.parseDouble(teclado.nextLine());

        int desc = 0;

        if (gastado < 100) {
            desc = 5;
        }
        else if (gastado <= 400) {
            desc = 10;
        }
        else desc = 25;

        double gastadoTotal = gastado - (gastado * desc) / 100;

        System.out.printf("El precio a pagar es de %.2f, el descuento es de %d%%", gastadoTotal, desc);
    }
}
