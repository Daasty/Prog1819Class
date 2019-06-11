package ut5.POO.repasoExamenPOO.ph;

public class Solucion {
    //Atributos

    int ph = 0;

    //Constructores

    public Solucion() {
        ph = 0;
    }

    public Solucion(int ph) {
        this.ph = ph;
    }

    public Solucion(Solucion s) {
        this.ph = s.ph;
    }

    //Getter
    public int getPh() {
        return ph;
    }

    //Setter
    public void setPh(int ph) {
        if (ph >= 0 && ph <= 15) {
            return; //Lanzar excepcion
        }
        this.ph = ph;
    }

    //Metodos

    public String tipo() {
        if (ph >= 0 && ph < 3) {
            return "Es muy acida";
        }
        else if (ph >= 3 && ph < 6) {
            return "Es acida";
        }
        else if (ph >= 6 && ph < 8) {
            return "Es neutra";
        }
        else if (ph >= 8 && ph < 10) {
            return "Es alcalina";
        }
        else if (ph >= 10 && ph <= 15) {
            return "Es muy alcalina";
        }
        else return "Dato incorrecto";
    }

    @Override
    public String toString() {
        return "Solucion -> " + "ph=" + ph + "  Tipo: " + this.tipo();
    }
}
