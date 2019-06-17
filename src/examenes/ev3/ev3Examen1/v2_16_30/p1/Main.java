package examenes.ev3.ev3Examen1.v2_16_30.p1;

public class Main {
    public static void main(String[] args) {
        Punto p = new Punto(1, 2);
        Punto p2 = new Punto(p);
        Punto p3 = new Punto(2, 3);
        Punto p4 = new Punto(p);

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        p4.toPoint(4, 5);
        System.out.println(p4);
        p3.toPoint(p4);
        System.out.println(p3);
    }
}