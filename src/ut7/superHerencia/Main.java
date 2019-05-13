package ut7.superHerencia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Herencia simple, modelo basico: ");
        Vehiculo vv = new Vehiculo("Mercedes", "Citaro",  2018);
        System.out.println(vv);

        Autobus aa = new Autobus("TAM", "Largant", 2010, 55, "escolar");
        System.out.println(aa);

        System.out.println();

        Camion cc = new Camion("REM", "Fantastico", 2009, 6000, 8000);
        System.out.println(cc);
    }
}
