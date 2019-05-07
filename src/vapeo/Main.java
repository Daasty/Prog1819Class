package vapeo;

import java.util.Scanner;

import vapeo.Persona;

/**
 * Preguntar por las personas que van a hacer el pedido: Nombre, numeroProductos, nombreProductos,precioTotal
 * <p>
 * Si hay algun descuento a aplicar al final
 */

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Pide el numero de personas que van a pedir
        System.out.println("Cuantas personas van a pedir?");
        int numPersonas = Integer.parseInt(teclado.nextLine());

        Persona.guardarPersonas(numPersonas, teclado);

        //Genera un pedido
        Pedidos perdido1 = new Pedidos("All4Flavours");

        Pedidos.InformacionTienda();


    }

    public void Imprimir() {

        //    System.out.printf("Anyo: " + Pedidos.getAnyo);

    }

}
