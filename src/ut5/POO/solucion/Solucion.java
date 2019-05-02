package ut5.POO.solucion;

public class Solucion {
    //Atributos
    private double ph = 0; // Valor por defecto

    //Constructor

    public Solucion() {} //Valor defecto
    public Solucion(double ph) {
        this.setPh(ph); //Generar excepcion pendiente
    }

    public Solucion(Solucion s) {
        this.ph = s.ph; //No genera excepciones
    }

    //Metodos de acceso
    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        if (ph < 0 || ph > 15) {
            return; //Lanzar excepcion (pendiente)
        }
        this.ph = ph;
    }

    public String clasificar() {
        //ph contiene valor real entre 0 y 15
        if (this.ph >= 10) {
            return "Muy alcalina";
        }
        if (this.ph >= 8) {
            return "Alcalina";
        }
        if (this.ph >= 6) {
            return "Neutra";
        }
        if (this.ph >= 3) {
            return "Ácida";
        }
        return "Muy ácida";
    }

    @Override
    public String toString() {
        return "Solucion{" +
                "ph=" + ph +
                '}';
    }
}


