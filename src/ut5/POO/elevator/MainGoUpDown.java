package ut5.POO.elevator;

public class MainGoUpDown {
    public static void main(String[] args) {
        Elevator e = new Elevator(2);

        for (int i = 1; i <= 4; i++) {
            e.goUpOneFloor();
            System.out.println("Subir > " + e);
        }

        System.out.println("Bajando...");

        for (int i = 1; i <= 4; i++) {
            e.goDownOneFloor();
            System.out.println("Bajar >> " + e);
        }
    }
}
