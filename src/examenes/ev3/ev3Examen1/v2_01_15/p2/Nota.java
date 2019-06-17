package examenes.ev3.ev3Examen1.v2_01_15.p2;

/**
 * Clase Nota
 * Atrib: double porcentaje
 * Const: 1. Que asigne valor 0
 * 2. Cree con el valor real que se le pasa
 *
 * @author daast
 *
 */
public class Nota {
    private double porcentaje = 0;

    //Constructores
    public Nota() {}

    public Nota(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    //Metodos de acceso

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            this.porcentaje = porcentaje;
        }
    }

    //Metodos publicos

    public String calificacion() {
        if (porcentaje >= 90) return "A";
        else if (porcentaje >= 80) return "B";
        else if (porcentaje >= 70) return "C";
        else return "F";
    }

    @Override
    public String toString() {
        return "Nota{" +
                "porcentaje=" + porcentaje +
                '}';
    }
}
