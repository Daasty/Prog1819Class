package vapeo;

import java.util.Scanner;

import java.util.ArrayList;

public class Pedidos {

    private String nombreAroma = "";
    private String tienda = "";
    private int precioTotal = 0;
    int dia = 0, mes = 0, anyo = 0;
    private ArrayList<String> porPersona = new ArrayList<String>();


    public Pedidos(String tienda) {
        this.nombreAroma = nombreAroma;
        this.tienda = tienda;
        this.precioTotal = precioTotal;
        this.porPersona = porPersona;
        this.anyo = anyo;
        this.mes = mes;
        this.dia = dia;
    }

    public static void InformacionTienda() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el nombre de la tienda a comprar: ");
        String tienda = teclado.nextLine();
        System.out.println("Dime la fecha: ");
        System.out.println("Dia:");
        int dia = Integer.parseInt(teclado.nextLine());
        System.out.println("Mes:");
        int mes = Integer.parseInt(teclado.nextLine());
        System.out.println("Anyo:");
        int anyo = Integer.parseInt(teclado.nextLine());
        System.out.println("Hay algun descuento actualmente?(si/no)");
        String resp = teclado.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            System.out.println("Dime el descuento: ");
            int descuento = Integer.parseInt(teclado.nextLine());
        }
        System.out.println("Cuantas personas van a pedir?");
        int numeroPers = Integer.parseInt(teclado.nextLine());
    }

    //Setter

    public void setNombreAroma(String nombreAroma) {
        this.nombreAroma = nombreAroma;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setPorPersona(ArrayList<String> porPersona) {
        this.porPersona = porPersona;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    //Getter
    public String getTienda() {
        return tienda;
    }

    public String getNombreAroma() {
        return nombreAroma;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public ArrayList<String> getPorPersona() {
        return porPersona;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
    }
}
