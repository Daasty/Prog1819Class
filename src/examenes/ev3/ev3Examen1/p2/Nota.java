package examenes.ev3.ev3Examen1.p2;

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

    //Atributos
    private double porcentaje = 0;

    //Constructores
    public Nota() {
        porcentaje = 0;
    }

    public Nota(double porcentaje) {
        this.porcentaje = porcentaje;
    }


    //Getters y Setters

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        if(porcentaje < 0 || porcentaje > 100) {
            //Lanzar excepcion pendiente
        }
        else this.porcentaje = porcentaje;
    }


    //Metodos publicos

    public String calificacion() {
        if((porcentaje >= 0 && porcentaje <= 100)) {
            if(this.porcentaje >= 90) {
                return "A";
            }
            else if(this.porcentaje >= 80) {
                return "B";
            }
            else if(this.porcentaje >= 70) {
                return "C";
            }
            else return "F";
        }
        else return "";
    }

    @Override
    public String toString() {
        return "Nota [porcentaje=" + porcentaje + "]";
    }


}
