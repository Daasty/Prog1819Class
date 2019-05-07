package vapeo;

import java.util.Scanner;
import vapeo.Persona;

/**
 * Preguntar por las personas que van a hacer el pedido: Nombre, numeroProductos, nombreProductos,precioTotal
 *
 * Si hay algun descuento a aplicar al final
 *
 *
 */

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas personas van a pedir?");
        int resp = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i <= resp; i++) {
    //        Persona i = new Persona(0, 0);
        }

        Pedidos perdido1 = new Pedidos("All4Flavours");

        Pedidos.InformacionTienda();





    }

    public void Imprimir() {

    //    System.out.printf("Anyo: " + Pedidos.getAnyo);

    }

}
