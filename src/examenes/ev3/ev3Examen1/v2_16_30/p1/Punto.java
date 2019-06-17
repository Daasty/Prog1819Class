package examenes.ev3.ev3Examen1.v2_16_30.p1;

/**
 * Atributos: x, y
 *
 * Constructores: Uno que se le pasen dos valores enteros para asignar coordenadas
 * Uno que se le pase otro punto para se le asignen las coordenadas al punto
 *
 * @author daast
 *
 */
public class Punto {
    private int x = 0;
    private int y = 0;

    public Punto(int x, int y) {
        this.toPoint(x, y);
    }

    public Punto(Punto p) {
        this.toPoint(p);
    }

    //Methods

    public void toPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void toPoint(Punto p) {
        this.toPoint(p.x, p.y);
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
