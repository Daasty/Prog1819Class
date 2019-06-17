package examenes.ev3.ev3Examen2.v2_01_15.p4;

import java.util.Random;

public class MiRandom extends Random {
    public int nextInt(int izq, int der) {
        izq = Math.abs(izq);
        der = Math.abs(der);

        if (izq > der) {
            int temp = izq;
            izq = der;
            der = temp;
        }

        return super.nextInt(der - izq + 1) + izq;
    }
}
