package examenes.external.ev2Examen2;

import java.text.Collator;

/**
 * Vector de cadenas cargado con datos
 * Ordenar de forma CRECIENTE con burbuja con test de comprobación y mostrar el vector.
 */
public class P2 {
    public static void main(String[] args) {
        String[] datos = {"hola", "adios", "que", "buen", "ala", "Dia", "hace", "perro", "gato", "telegram", "Agacharse"};

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%s, ", datos[i]);
        }
        System.out.println();

        int max = datos.length - 1;
        String aux = "";
        for (int i = 0; i < datos.length; i++) {
            boolean sw = true;
            for (int j = 0; j < max; j++) {
                if (comp.compare(datos[j], datos[j + 1]) > 0) {
                    aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                    sw = false;
                }
            }
            if (sw) break;
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%s, ", datos[i]);
        }
    }
}
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