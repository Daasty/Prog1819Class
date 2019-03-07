package examenes.ev2.examen1ev2;

/**
 * CORREGIDO
 *
 * EV2 Examen 1
 * Rellenar desde codigo un array sin ordenar para indicar si son todos distintos o no.
 *
 * RESPUESTA -> Hay que usar la búqueda secuencial, ya que necesitamos recorrer con dos bucles el array,
 * a parte de que al ser un vector desordenado, la búqueda binaria no sería ni efectiva ni funcional.
 *
 * @Daasty
 */
public class P4 {
    public static void main(String[] args) {

        int datos[] = {22, 29, 43, 4, 54, 21, 38, 84, 87, 56, 233, 38, 23, 62};
        boolean sw = true;
        int cont = 0;

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Iteracion %d.\n", i); //Traza de iteraciones del bucle

            for (int j = i + 1; j < datos.length - 1; j++){
                if (datos[i] == datos[j] && i != j) {
                    System.out.printf("Hay dos números iguales, %d y %d. En las pos %d y %d.\n", datos[i], datos[j], i , j);
                    System.out.println("No seguimos buscando, ya sabemos que no son todos iguales, paramos ejecución.");
                    sw = false;
                }
                cont++;
            }

            if (!sw) break; //Ejecutamos hasta que salga la primera coincidencia y paramos proceso
        }

        if (sw) {
            System.out.println("Todos los números son distintos");
        }

        System.out.println(cont);
    }
}