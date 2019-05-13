package ut7.superHerencia;

public class Autobus extends Vehiculo {
    private int pasajeros = 55;
    private String tipo = "urbano";

    public Autobus(String marca, String modelo, int anyo, int pasajeros, String tipo) {
        super(marca, modelo, anyo);
        this.pasajeros = pasajeros;
        this.tipo = tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Autobus [%s, %d pasajeros, tipo -> %s ]", super.toString(), pasajeros, tipo);

    }
}