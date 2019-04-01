package ut5.POO.pdfClaseAle;

public class Main {
    public static void main(String[] args) {
        Elevator weanLeft = new Elevator(8, 10);
        Elevator weanRight = new Elevator(8);

        weanLeft.addRiders(5);
        weanLeft.goUpOneFloor();
        System.out.println("Left: " + weanLeft);

        if (weanLeft.equals(weanRight)) {
            System.out.println("Nothing");
        }
    }
}
