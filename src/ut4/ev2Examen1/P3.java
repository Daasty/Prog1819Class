package ut4.ev2Examen1;

public class P3 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        //comprobacion con negativos
        //int[] numeros={1,6,7,-8,63,-4,6,2,3,5,4,6};

        //comprobacion con solo positivos
        int[] numeros={1,6,7,8,63,4,6,2,3,5,4,6};

        boolean swPos=true;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]<0) {
                swPos=false;
                break;
            }
        }

        if(swPos) {
            System.out.println("Todos los numeros del vector son Positivos");
        }
        else {
            System.out.println("Hay valores NEGATIVOS en el vector");
        }
    }

}
