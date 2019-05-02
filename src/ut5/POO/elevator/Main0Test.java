package ut5.POO.elevator;

public class Main0Test {
    public static void main(String[] args) {
        Elevator e1 = new Elevator(10);
        Elevator e2 = new Elevator(10, -2);
        Elevator e3 = new Elevator(10, -1);

        System.out.println("E1> " + e1);
        //TODO añadir otra
        e1.addRiders(6);
        System.out.println("E1>> " + e1);
        e1.removeRiders(2);
        System.out.println("E1>>> " + e1);
        e1.removeRiders(2);
        System.out.println("E1>>> " + e1);

        e1.addRiders(12);
        System.out.println("E1>>>> " + e1);
        e1.removeAll();
        System.out.println("E1>>>> " + e1);
    }
}
