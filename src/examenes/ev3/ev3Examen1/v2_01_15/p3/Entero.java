package examenes.ev3.ev3Examen1.v2_01_15.p3;

/**
 *
 * Atrib: int num
 * Const: Cree objeto con valor igual al que se le pasa
 * Methods:
 * public int igualPrimeraUltima();
 * public int esPositivo();
 * public int esNegativo();
 * public int esCero();
 *
 * Para sacar el ultimo dividimos entre % 10
 * Para sacar el primero dividimos entre 10 hasta que sea mayor que 10
 * @author daast
 *
 */
public class Entero {

    private int num = 0;

    //Constructores
    public Entero(int num) {
        this.num = num;
    }

    //Metodos publicos

    public boolean igualPrimeraUltima() {
        int temp = Math.abs(this.num);
        int primera = 0;
        do {
            primera = temp % 10;
            temp /= 10;
        } while (temp != 0);
        return primera == this.num % 10;
    }

    public boolean esPositivo() {
        if (num > 0) {
            return true;
        }
        else return false;
    }

    public boolean esNegativo() {
        if (num < 0) {
            return true;
        }
        else return false;
    }

    public boolean esCero() {
        if (num == 0) {
            return true;
        }
        else return false;
    }

}