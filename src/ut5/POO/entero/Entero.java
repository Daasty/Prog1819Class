package ut5.POO.entero;


public class Entero {
    //Atributos
    private int numero = 0;

    //Constructor

    public Entero() {
    }
    public Entero(int numero) {
        this.numero = numero;
    }

    public Entero(Entero e) {
        this(e.numero);
    }

    //Getters y Setters

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    //Metodos

    public boolean esPar() {
        if (this.numero % 2 == 0) {
            return true;
        } else return false;
    }

    public boolean esImpar() {
        return !this.esPar();
    }

    public boolean esPositivo() {
        if (this.numero > 0) {
            return true;
        } else return false;
    }

    public boolean esNegativo() {
        if (this.numero < 0) {
            return true;
        } else return false;
    }

    public boolean esCero() {
        if (this.numero == 0) {
            return true;
        } else return false;
    }

    public int ultimaCifra() {
        return this.numero % 10;
    }

    public int primeraCifra() {
        int temp = Math.abs(this.numero);
        int resto = 0;
        do {
            resto = temp % 10;
            temp = temp / 10;
        } while (temp != 0);
        return resto;
    }

    public int numeroCifras() {
        int temp = Math.abs(this.numero);
        int cont = 0;
        do {
            temp /= 10;
            cont++;
        } while (temp != 0);
        return cont;
    }

    @Override
    public String toString() {
        String cadena = "";
        int temp = Math.abs(this.numero);
        int resto = 0;
        do {
            cadena = (temp % 10) + cadena;
            temp /= 10; //temp = temp / 10
        } while(temp != 0);
        if (this.esNegativo())
            cadena = "-" + cadena;
        return cadena;
    }
}