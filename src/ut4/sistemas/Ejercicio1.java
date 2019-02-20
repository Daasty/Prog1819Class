package ut4.sistemas;

/**
 * 1. Mostrar listado de notas en una tabla
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Daniel", "David HM", "David MH", "Juan", "Julia", "Maria AB", "Maria FM", "Noé", "Nuria",
        "Pedro", "Rosa", "Sandra", "Santiago", "Sara"};
        String[] asignaturas ={"Programación", "Entornos", "Marcas", "FOL", "Bases de datos", "Sistemas"};

        // %4d %15s %4d %15s
        int[][] notas = {
                {5, 6, 3, 7, 6, 8},
                {3, 3, 3, 5, 5, 6},
                {9, 8, 8, 7, 8, 9},
                {9, 5, 8, 9, 9, 4},
                {9, 10, 10, 9, 10, 10},
                {10, 10, 7, 7, 10, 8},
                {6, 6, 4, 5, 4, 4},
                {7, 5, 7, 5, 3, 6},
                {4, 5, 4, 5, 4, 4},
                {5, 5, 8, 6, 4, 4},
                {4, 3, 4, 4, 3, 4},
                {6, 9, 3, 8, 7, 6},
                {10, 8, 6, 6, 8, 8},
                {4, 6, 6, 5, 6, 6},
                {7, 7, 8, 9, 7, 9}
        };

        System.out.println("Listado de notas: ");

        System.out.printf("%23s", "");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.printf("%s %3s", asignaturas[i], "");
        }
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.printf("%d %3s", i, "");
        }

    }
}
