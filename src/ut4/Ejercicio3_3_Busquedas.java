package ut4;

public class Ejercicio3_3_Busquedas {
    public static void main(String[] args) {
        int datos[] = {3, 6, 5, 8, 7, 1, 34, 45, 52, 43, 41, 46 ,97, 76, 32, 31};
        boolean sw = false;

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                if (datos[i] == datos[j] && i != j) {
                    sw = true;
                }
            }
        }

        if (!sw) {
            System.out.println("Todos los valores son diferentes");
        }
        else System.out.println("Hay valores iguales dentro del array.");
    }
}
