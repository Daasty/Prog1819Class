package examenes.ev3.p1;

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
    //Atributos
    private int x = 0;
    private int y = 0;

    //Constructores

    public Punto(int x, int y) { //Constructor que se le pasan dos valores
        this.x = x;
        this.y = y;
    }

    //Sobrecarga
    public Punto(Punto p) { //Constructor que se le pasa otro punto para asignar coordenadas
        this.x = p.x;
        this.y = p.y;
    }

    //Getters y Setters
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

    //Metodos Publicos

    public boolean esIgual(Punto p) {
        if( this.x == p.x && this.y == p.y) {
            return true;
        }
        else return false;
    }

    public boolean esIgual(int x, int y) {
        if(this.x == x && this.y == y) {
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Punto = X -> " + x + " Y -> " + y;
    }



}
