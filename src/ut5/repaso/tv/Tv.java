package ut5.repaso.tv;

public class Tv {
    //Atrib
    private int canal = 1;
    private int volumen = 15;
    private boolean isOn = false;

    //Constructores
    public Tv() {

    }

    //Getters and setters

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal <= 99) {
            this.canal = canal;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen > 0 && volumen <= 20) {
            this.volumen = volumen;
        }

    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    //Metodos publicos

    public void encender() {
        this.isOn = true;
    }

    public void apagar() {
        this.isOn = false;
    }

    public void subirCanal() {
        if (isOn && canal < 99) this.canal++;
    }

    public void bajarCanal() {
        if (isOn && canal > 0) this.canal--;
    }

    public void subirVolumen() {
        if (isOn && volumen < 20) this.volumen++;
    }

    public void bajarVolumen() {
        if (isOn && volumen > 0) this.volumen--;
    }

    @Override
    public String toString() {
        return "Tv{" + " canal=" + canal + ", volumen=" + volumen + " isOn=" + isOn + '}';
    }
}
