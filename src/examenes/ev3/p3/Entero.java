package examenes.ev3.p3;

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

    //Atributos
    int num;

    //Constructor

    public Entero(int num) {
        this.num = num;
    }

    //Metodos publicos
    public boolean igualPrimeraUltima() {
        if(num < 0) {
            num = Math.abs(num);
        }

        if(num < 10) {
            return true;
        }

        //Ultimo numero

        int temp = 0;
        temp = num % 10;

        //Primer numero
        int temp2 = 0;
        while(num >= 10) {
            num /= 10;
            temp2 = num;
        }
        System.out.println("Temp: " + temp2 + "\nTemp2: " + temp);
        if(temp == temp2) {
            return true;
        }
        else return false;


    }

    public boolean esPositivo(int num) {
        if(num > 0) {
            return true;
        }
        else return false;
    }

    public boolean esNegativo(int num) {
        if(num < 0) {
            return true;
        }
        else return false;
    }

    public boolean esCero(int num) {
        if(num == 0) {
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Entero [num=" + num + "]";
    }


}