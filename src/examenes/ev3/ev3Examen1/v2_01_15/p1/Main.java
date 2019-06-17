package examenes.ev3.ev3Examen1.v2_01_15.p1;

public class Main {

    public static void main(String[] args) {
        Punto p = new Punto(1, 2);
        Punto p2 = new Punto(2, 3);
        Punto p3 = new Punto(p);
        Punto p4 = new Punto(p2);
        System.out.println(p.esIgual(p2));
        System.out.println(p.esIgual(p3));
        System.out.println(p.esIgual(1,3));
    }
}