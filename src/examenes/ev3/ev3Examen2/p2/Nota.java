package examenes.ev3.ev3Examen2.p2;

public class Nota {
    //Atributos
    private double porcentaje = 0;

    //Constructor
    public Nota(double porcentaje) throws Exception {
        this.setPorcentaje(porcentaje);
    }

    //Getter y Setter


    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) throws Exception {
        if (porcentaje >= 0 && porcentaje <= 100) {
            this.porcentaje = porcentaje;
        }
        else throw new Exception("Introduce un numero entre 0 y 100");
    }

    public String calificacion() {
        if (porcentaje >= 90) return "A";
        else if (porcentaje >= 80) return "B";
        else if (porcentaje >= 70) return "C";
        else return "F";
    }

    @Override
    public String toString() {
        return "Nota > "+ calificacion() +"Porcentaje > " + porcentaje;
    }
}
