package ut5.POO.pdfClaseAle;

public class Main0Test {
    public static void main(String[] args) {
        Elevator e1 = new Elevator(10);
        Elevator e2 = new Elevator(10, 8);
        Elevator e3 = new Elevator(10, 8);

        System.out.println("E1> " + e1);
        System.out.println("E2> " + e2);
        System.out.println("E3> " + e3);

        e1.addRiders(6);
        System.out.println("E1>> " + e1);
        e1.addRiders(10);
        System.out.println("E1>>> " + e1);

        if (e1.equals(e2)) {
            System.out.println("Son iguales.");
        }
        else System.out.println("Son diferentes.");
    }
}
