package ut7.vehiculos;

public class Camion extends Vehiculo{
    private int tara = 0;
    private int mma = 0;

    public Camion(String marca, String modelo, int anyo, int tara, int mma) {
        super(marca, modelo, anyo);
        this.tara = tara;
        this.mma = mma;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getMma() {
        return mma;
    }

    public void setMma(int mma) {
        this.mma = mma;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "tara=" + tara +
                ", mma=" + mma +
                '}';
    }
}
