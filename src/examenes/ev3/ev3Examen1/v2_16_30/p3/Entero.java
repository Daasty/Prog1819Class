package examenes.ev3.ev3Examen1.v2_16_30.p3;

public class Entero {
    private int num = 0;

    public Entero(int num) {
        this.num = num;
    }

    public int cifrasPares() {
        int temp = Math.abs(this.num);
        int cont = 0;

        do {
            if (temp % 10 % 2 == 0) {
                cont++;
            }
            temp /= 10;
        } while (temp != 0);
        return cont;
    }

    public boolean esPositivo() {
        if (this.num > 0) return true;
        else return false;
    }

    public boolean esNegativo() {
        if (this.num < 0) return true;
        else return false;
    }

    public boolean esCero() {
        if(this.num == 0) {
            return true;
        }
        else return false;
    }


}