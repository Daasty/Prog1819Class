package ut8.repaso.edades;

public class Main {
    public static void main(String[] args) {

        System.out.println(1);
        try {
            Edad e = new Edad(10);
            System.out.println(e);
        }catch (Exception e) {
            System.out.println("Error >" + e.getMessage());
        }

        System.out.println(2);
        try {
            Edad e = new Edad(-10);
            System.out.println(e);
        }catch (Exception e) {
            System.out.println("Error >" + e.getMessage());
        }

        System.out.println(3);
        try {
            Edad e = new Edad(1000);
            System.out.println(e);
        }catch (Exception e) {
            System.out.println("Error >" + e.getMessage());
        }

        System.out.println(4);
        try {
            Edad e = new Edad(10);
            System.out.println(e);
            Edad e1 = new Edad(e);
            System.out.println(e);
            System.out.println(e1);
        }catch (Exception e) {
            System.out.println("Error >" + e.getMessage());
        }
    }

}
