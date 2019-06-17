package ut5.repaso.persona;

public class Main {
    public static void main(String[] args) {
        try {
            Persona p = new Persona(10);
            System.out.println(p);
        }catch (Exception e){
            System.out.println("Error >" + e.getMessage());
        }

        try {
            Persona p = new Persona(-10);
            System.out.println(p);
        }catch (Exception e){
            System.out.println("Error >" + e.getMessage());
        }

        try {
            Persona p = new Persona(1000);
            System.out.println(p);
        }catch (Exception e){
            System.out.println("Error >" + e.getMessage());
        }

        try {
            Persona p = new Persona(70);
            System.out.println(p);
        }catch (Exception e){
            System.out.println("Error >" + e.getMessage());
        }
    }
}
