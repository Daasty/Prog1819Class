package pruebas;

/**
 * Ordenación de un array de valores por burbuja mejorado con test de comprobación
 */
public class BurbujaTest2 {
    public static void main(String[] args) {
        int datos[] = {3, 2, 23, 54, 34, 2, 43, 567, 7,6, 5, 34, 4};
        //int datos[] = {2, 4, 8, 12, 14, 16, 17, 25, 28, 36, 47, 58, 69, 70};

        boolean sw = true;
        int max = datos.length;
        int temp = 0;

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Iteración %d.\n", i);
            for (int j = 1; j < (max - i); j++) {
                sw = true;
                if (datos[j - 1] > datos[j]){
                    temp = datos[j -1];
                    datos[j -1] = datos[j];
                    datos[j] = temp;
                    sw = false;
                }
            }

            if (sw) {
                System.out.println("Está ordenado.");
                break;
            }
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%d ", datos[i]);
        }
    }
}

//Solución de César
/*
int max = datos.length;
        int temp = 0;
        for(int i=0; i < max; i++){
            for(int j=1; j < (max-i); j++){
                if(datos[j-1] > datos[j]){
                    //swap elements
                    temp = datos[j-1];
                    datos[j-1] = datos[j];
                    datos[j] = temp;
                }
            }
        }
 */
//La mía 1
/*
 int max = datos.length;
        int temp = 0;
        boolean sw = true;

        for (int i = 0; i < max; i++) {
            sw = true;
            System.out.printf("Pasada %d.\n", i + 1);
            for (int j = 1; j < (max - i); j++) {
                if (datos[j - 1] > datos[j]) {
                    temp = datos[j];
                    datos[j] = datos[j - 1];
                    datos[j - 1] = temp;
                    sw = false;
                }
            }
            if (sw) {
                System.out.println("Está ordenado.");
                break;
            }
        }
 */
//La mía 2
/*
int max = datos.length;
        boolean sw = true;
        int temp = 0;

        for (int i = 0; i < max; i++) {
            sw = true;
            System.out.printf("Iteración %d.", i + 1);
            for (int j = 1; j < (max - i); j++) {
                if (datos[j - 1] > datos[j]) {
                    temp = datos[j];
                    datos[j] =  datos[j - 1];
                    datos[j -1] = temp;
                    sw = false;
                }
            }
            if (sw) {
                System.out.println("Está ordenado.");
                break;
            }
            max++;
        }
 */
//La mía 3
/*
        int max = datos.length;
        int temp = 0;
        boolean sw = true;

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Pasada %d.\n", i);

            for (int j = 1; j < (max - i); j++) {
                sw = true;
                if (datos[j - 1] > datos[j]) {
                    temp = datos[j];
                    datos[j] = datos[j - 1];
                    datos[j - 1] = temp;
                    sw = false;
                }
            }
            if (sw) {
                System.out.println("Está ordenado");
                break;
            }
        }


 */