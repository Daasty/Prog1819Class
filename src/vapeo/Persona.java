package vapeo;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    private String nombre = "";
    private int numeroProductos = 0;
    private int precioTotalPersona = 0;
    private int numeroPersonas = 0;
    private ArrayList<String> nombreProductos = new ArrayList<String>();
    public static Persona[] person = new Persona[8];


    //Costructor

    public Persona(String nombre, int precioTotal, int numeroProductos) {
        this.nombre = nombre;
        this.precioTotalPersona = precioTotal;
        this.numeroProductos = numeroProductos;

    }

    public void guardarPersonas() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas personas van a pedir?");
        int numPersonas =  Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < numPersonas; i++){
            System.out.printf("Dime el nombre de la persona %d", i + 1);
            String resp = teclado.nextLine();

           // Persona i = new Persona(resp, 0, 0);
        }

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
    public ArrayList<String> getNombreProductos() {
        return nombreProductos;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioTotalPersona(int precioTotalPersona) {
        this.precioTotalPersona = precioTotalPersona;
    }

    public void setNumeroProductos(int numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    public void setNombreProductos(ArrayList<String> nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

  /*  public static void CreadorPersonas(numPersonas) {

    }
  */
}
