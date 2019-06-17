package examenes.ev3.ev3Examen2.v2_01_15.p3;

public class Nota {
    private double porcentaje = 0;

    public Nota(double porcentaje) throws Exception {
        this.setPorcentaje(porcentaje);
    }

    //Getters y setters

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) throws Exception {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new Exception("Nota entre 0 y 100");
        }
        else this.porcentaje = porcentaje;
    }

    //Methods

    public String calificacion() {
        if (porcentaje >= 90) {
            return "A";
        }
        else if (porcentaje >= 80) {
            return "B";
        }
        else if (porcentaje >= 70) {
            return "C";
        }
        else return "F";
    }

    @Override
    public String toString() {
        return "Nota{" +
                "porcentaje=" + porcentaje + '}' + calificacion();
    }
}
