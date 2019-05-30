package ut7.ajedrez;

public class Pieza {
    private int x = 8;
    private int y = 8;

    public Pieza(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0 && x <= 8) {
            this.x = x;
        }

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 0 && y <= 8) {
            this.y = y;
        }
    }

    public boolean movimientoValido(int x, int y) {
        if (this.x == x && this.y == y ) {
            return true;
        }
        else return false;
    }
}
