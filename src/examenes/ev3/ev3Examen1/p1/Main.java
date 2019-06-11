package examenes.ev3.ev3Examen1.p1;

public class Main {

    public static void main(String[] args) {
        Punto p = new Punto(1,2);
        Punto c = new Punto(p);
        Punto e = new Punto(3,4);

        System.out.println(p);
        System.out.println(c);
        System.out.println(e);

        System.out.println("Con punto c: ");
        System.out.println(p.esIgual(c));
        System.out.println(p.esIgual(1, 2));

        System.out.println("Con punto e: ");
        System.out.println(p.esIgual(e));
        System.out.println(e.esIgual(1, 2));
    }

}