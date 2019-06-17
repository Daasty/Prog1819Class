package ut5.repaso.cafetera;

public class Cafetera {
    //Atributos
    private int capacidadMaxima = 1000;
    private int nivelActual = 0;

    //Constructor

    public Cafetera(){}

    public Cafetera(int capacidadMaxima, int nivelActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.nivelActual = capacidadMaxima;
    }

    //Metodos de acceso


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }

    //Metodos publicos

    public void llenar() {
        this.nivelActual = capacidadMaxima;
    }

    public int servirTaza(int capacidad) {
        if (capacidad >= nivelActual) { //Si lo que se pide es mas de lo que le queda a la cafetera
            int temp = nivelActual;
            nivelActual = 0;
            return temp;
        }
        else { //Si a la cafetera todavia le queda
            this.nivelActual -= capacidad;
            return capacidad;

        }
    }

    public void vaciar() {
        this.nivelActual = 0;
    }

    public int agregarCafe(int cantidad) {
        this.nivelActual += cantidad;
        if (cantidad > this.capacidadMaxima) {
            llenar();
        }
        return this.nivelActual;
    }

    @Override
    public String toString() {
        return "CapacidadMaxima = " + capacidadMaxima +
                ", nivelActual=" + nivelActual;
    }
}
