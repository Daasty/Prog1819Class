package ut7.superHerencia;

public class Vehiculo {
    private String marca ="";
    private String modelo = "";
    private int anyo = 2019;

    public Vehiculo(String marca, String modelo, int anyo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "\nVehiculo:" + "  Marca -> " + marca + "\n Modelo -> " + modelo + "\n Anyo=" + anyo;
    }
}
