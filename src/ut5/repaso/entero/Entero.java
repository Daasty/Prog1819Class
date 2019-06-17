package ut5.repaso.entero;

public class Entero {
    //Attrib
    private int num = 0;

    //Constructor

    public Entero(){}

    public Entero(int num) {

    }

    public Entero(Entero n) {
        this.num = n.num;
    }

    //Get and set

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //Methods

    public boolean esPar() {
        if (this.num % 2 == 0) return true;
        else return false;
    }

    public boolean esImpar() {
        if (this.num % 2 != 0) return true;
        else return true;
    }

    public boolean esPositivo() {
        if (this.num > 0) return true;
        else return false;
    }

    public boolean esNegativo() {
        if (this.num < 0) return true;
        else return false;
    }

    public boolean esCero() {
        if (this.num == 0) return true;
        else return false;
    }

    public int ultimaCifra() {
        return this.num % 10;
    }

    public int primeraCifra() {
        int temp = Math.abs(this.num);
        int resto = 0;
        do {
            resto = temp % 10;
            temp /= 10;
        } while (temp != 0);
        return resto;
    }

    public int numeroCifras() {
        int temp = Math.abs(this.num);
        int cont = 0;
        do {
            temp /= 10;
            cont++;
        }while (num != 0);
        return cont;
    }

    /*@Override
    public String toString() {
        String cadena = "";
        int temp = Math.abs(this.num);
        int resto = 0;
        do {
            cadena = (temp % 10) + cadena;
            temp /= 10;
        } while (temp != 0);
        if (this.esNegativo()) cadena = "-" + cadena;
        return cadena;
    }

     */

    @Override
    public String toString() {
        return "Entero{" +
                "num=" + num +
                '}';
    }
}
