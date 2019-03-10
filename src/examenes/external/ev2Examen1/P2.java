package examenes.external.ev2Examen1;

import java.text.Collator;

public class P2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        String[] nombres = {"Juan", "Ana", "Pedro", "Laura", "Roberto", "Lorena", "Ana", "Luis"};

        for (int tope = nombres.length - 1; tope >= 1; tope--) {
            boolean swOrd = true;
            for (int i = 1; i <= tope; i++) {

                if (comp.compare(nombres[i - 1], nombres[i]) > 0) {
                    String temp = nombres[i - 1];
                    nombres[i - 1] = nombres[i];
                    nombres[i] = temp;
                    swOrd = false;
                }

            }
            if (swOrd) break;

        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }

    }

}