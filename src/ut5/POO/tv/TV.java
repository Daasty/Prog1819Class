package ut5.POO.tv;

public class TV {
    private boolean encendido = true;
    private int programa = 1;
    private int volumen = 10;


    //Metodos de acceso
    public boolean isEncendido() {
        return encendido;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setPrograma(int programa) {
        if (this.encendido && programa >=1 && programa < 99) {
            this.programa = programa;
        }
    }

    public void setVolumen(int volumen) {
        if (this.encendido && volumen >= 1 && volumen <= 20) {
            this.volumen = volumen;
        }
    }

    //Metodos

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public int subirVolumen() {
        if (this.encendido && this.volumen < 20) {
            this.volumen++;
        }
        return this.volumen;
    }

    public int bajarVolumen() {
        if (this.encendido && this.volumen > 1) {
            this.volumen--;
        }
        return this.volumen;
    }

    public int subirPrograma() {
        if (this.encendido && this.programa < 99) {
            this.programa++;
        }
        return this.programa;
    }

    public int bajarPrograma() {
        if (this.encendido && this.programa > 1) {
            this.programa--;
        }
        return this.programa;
    }


    @Override
    public String toString() {
        return "TV [Encendido = " + encendido + ", programa = " + programa + ", volumen = " + volumen + "]";
    }

}
