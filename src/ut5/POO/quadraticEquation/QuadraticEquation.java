package ut5.POO.quadraticEquation;

public class QuadraticEquation {
    //Atributos:
    private int a,b,c;

    //Constructor que se le pasan los parametros:
    public  QuadraticEquation (int a, int b, int c) {
        this.a = a;
        this.b =b;
        this.c=c;
    }
    //GETERS Y SETERS:
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    //METODOS:

    //Metodo que devuelve el discriminante(en la formula, el resultado de la raiz)
    public double getDiscriminant() {
        return Math.pow(b, 2) - (4*a*c);
    }
    //Metodo que devuelve la 1?formula con sumando la raiz (Siempre tiene que ser mayor que 0, si no devuelve 0)
    public double getRoot1 () {
        double discriminant = getDiscriminant();
        if(discriminant > 0)
            return (double)(-this.b + Math.sqrt(discriminant))/(2*a);
        else
            return 0;
    }
    //Metodo que devuelve la 2?formula con restando la raiz (Siempre tiene que ser mayor que 0, si no devuelve 0)
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if(discriminant > 0)
            return (double)(-this.b - Math.sqrt(discriminant))/(2*a);
        else
            return 0;
    }


}