package ut4.sistemas.sistema2MatriculacionEOI;

/**
 * 1. Mostrar total de alumnos matriculados en Castilla y León
 * 2. Mostrar el total de alumnos matriculados por provincia
 * 3. Mostrar total de alumnos matriculados por idioma
 *
 * @Daasty 1.0
 */
public class Principal {
    public static void main(String[] args) {
        String[] ciudades = {"Avil", "Burg", "Leon", "Vale", "Sala", "Sego", "Sori", "Vall", "Zamo"};
        String[] idiomas = {"Ingles", "Frances", "Aleman", "Chino", "Portugues", "Italiano", "Arabe"};

        int[][] datos = {
                {1000, 2300, 130, 324, 12, 154, 311245, 6789, 87},
                {230, 345, 543, 527, 1325, 189, 436, 7831, 789},
                {100, 137, 852, 3120, 4628, 274, 1824, 1741, 130},
                {462, 1849, 1749, 1930, 573, 5830, 968, 178, 584},
                {194, 1648, 8967, 2948, 2849, 2189, 119573, 194, 929},
                {94, 7743, 589, 857, 586, 284, 2745, 199, 2846, 28},
                {104, 2795, 3829, 586, 2940, 2947, 1058, 779, 2184},
        };

        System.out.printf("%10s", "");

        for (String ciu : ciudades) {
            System.out.printf("%8s", ciu);
        }
        System.out.println();

        int maxTotal = 0, total = 0;
        int[] showProv = new int[9];
        int[] showLang = new int[7];

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%-10s", idiomas[i]);
            total = 0;

            for (int j = 0; j < datos[0]. length; j++) {
                System.out.printf("%8d", datos[i][j]);
                maxTotal += datos[i][j];
                showProv[j] += datos[i][j];
                total += datos[i][j];
            }
            showLang[i] = total;
            System.out.println();
        }

        System.out.println();

        //Total de matriculados en CyL
        System.out.printf("Se han matriculado %d personas en todo CyL.\n", maxTotal);

        System.out.println();
        //Total por provincias
        for (int i = 0; i < showProv.length; i++) {
            System.out.printf("%-6s --> %5d\n", ciudades[i], showProv[i]);
        }
        System.out.println();
        //Total por idiomas

        for (int i = 0; i < showLang.length; i++) {
            System.out.printf("%-6s --> %5d\n", idiomas[i], showLang[i]);
        }


    }
}
