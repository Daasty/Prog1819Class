package vapeo;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    private static Persona[] persona = new Persona[8];
    private String nombre = "";
    private int numeroProductos = 0;
    private int precioTotalPersona = 0;
    private int numeroPersonas = 0;


    //Constructor

    public Persona(String nombre) {
        this.nombre = nombre;

    }


    public static void guardarPersonas(int numPersonas, Scanner teclado) {

        persona = new Persona[numPersonas];

        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Nombre persona " + (i + 1) + ": ");
            String nombre = teclado.nextLine();
            persona[i] = new Persona(nombre);

        }

        mostrarDatos();

    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public int getPrecioTotalPersona() {
        return precioTotalPersona;
    }

    public int getNumeroProductos() {
        return numeroProductos;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    //Setter

    public void setPrecioTotalPersona(int precioTotalPersona) {
        this.precioTotalPersona = precioTotalPersona;
    }

    public void setNumeroProductos(int numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    private static void mostrarDatos() {
        for (int i = 0; i < persona.length; i++) {
            System.out.println();
            System.out.println(persona[i]);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNumero de articulos: " + numeroProductos + "\nPrecio total: " + precioTotalPersona;
    }
}
