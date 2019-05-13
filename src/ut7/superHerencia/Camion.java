package ut7.superHerencia;

public class Camion extends Vehiculo{
    private int mma = 4000;
    private int tara = 3000;

    public Camion(String marca, String modelo, int anyo, int mma, int tara) {
        super(marca, modelo, anyo);
    }

    public int getMma() {
        return mma;
    }

    public void setMma(int mma) {
        this.mma = mma;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Camion: " + "  Mma -> " + mma + "  Tara -> " + tara  + super.toString();
    }
}
