package ut5.POO.repasoExamenPOO.tv;

public class Tv {

    //Atributos
    int canal = 0;
    int volumen = 0;
    boolean on = false;

    //Constructor
    public Tv(int canal, int volumen, boolean on) {
        this.canal = canal;
        this.volumen = volumen;
        this.on = on;
    }

    //Sobrecarga
    //Valor inicial si no se especifica nada
    public Tv(boolean on) {
        this(1, 10, on);
    }

    public Tv() {

    }

    //Getters y Setters

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    //Metodos publicos

    public void subirCanal() {
        if (canal >= 0 && canal < 100 && on == true) {
            canal++;
        }
    }

    public void bajarCanal() {
        if (canal >= 0 && canal < 100 && on == true) {
            canal--;
        }
    }

    public void subirVolumen() {
        if (volumen >= 0 && volumen <= 20 && on == true) {
            volumen++;
        }
    }

    public void bajarVolumen() {
        if (volumen >= 0 && volumen <= 20 && on == true) {
            volumen--;
        }
    }

    public void seleccionCanal(int canal) {
        if (canal >= 0 && canal < 100 && on == true) {
            this.canal = canal;
        }
    }


    public void seleccionVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 20 && on == true) {
            this.volumen = volumen;
        }
    }

    public void encender() {
        this.on = true;
    }

    public void apagar() {
        this.on = false;
    }


    @Override
    public String toString() {
        return "Tv -> "  + "canal=" + canal + ", volumen=" + volumen + ", on=" + on;
    }
}
