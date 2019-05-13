package ut5.POO.punto;

public class Punto {
    //Atributos:
    private int x = 0, y = 0;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void arriba() {
        this.y--;

    }

    public void derecha() {
        this.x++;
    }

    public void abajo() {
        this.y++;
    }

    public void izquierda() {
        this.x--;
    }

    @Override
    public String toString() {
        return String.format("(d%, d%)", x, y);
    }

}