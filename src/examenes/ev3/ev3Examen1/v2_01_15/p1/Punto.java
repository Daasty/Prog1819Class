package examenes.ev3.ev3Examen1.v2_01_15.p1;

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
    private int x = 0, y = 0;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p) {
        this(p.x, p.y);
    }

    //Metodos
    public boolean esIgual(Punto p) {
        if (p.x == x && p.y == y) {
            return true;
        }
        else return false;
    }

    public boolean esIgual(int x, int y) {
        if (this.x == x && this.y == y) {
            return true;
        }
        else return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto(" + x + "," + y + ")";
    }
}
