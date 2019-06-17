package ut5.repaso.conversor;

import ut5.repaso.contador.Contador;

public class Conversor {
    //Attrib
    private int num = 1;

    //Constructor
    public Conversor() {}

    public Conversor(int num) {
        this.num = num;
    }

    //Getters and setters


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //Methods
    private String conversorBase(int base) {
        int temp = Math.abs(this.num);
        String cad = "";
        do {
            int resto = temp % base;
            if (resto <= 9) {
                cad = resto + cad;
            }
            else {
                char car = ' ';
                switch (resto) {
                    case 10: car = 'A'; break;
                    case 11: car = 'B'; break;
                    case 12: car = 'C'; break;
                    case 13: car = 'D'; break;
                    case 14: car = 'E'; break;
                    case 15: car = 'F'; break;
                }
                cad = car + cad;
            }
            temp /= base;
        } while (temp > 0);
        return cad;
    }

    public String toBin() {
        return this.conversorBase(2);
    }

    public String toOct() {
        return this.conversorBase(8);
    }

    public String toHex() {
        return this.conversorBase(16);
    }

    @Override
    public String toString() {
        return String.format("Conversor [num = %s]", num);
    }
}
