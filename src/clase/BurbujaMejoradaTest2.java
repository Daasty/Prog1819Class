package clase;

public class BurbujaMejoradaTest2 {
    public static void main(String[] args) {
        int max = -1;
        int temp = 0;
        boolean sw = false;

        //int [] vector = {22,6,3,8,2,1,14};
        int [] vector = {1,2,3,4,5,6};
        for (int i=0; i <= vector.length - max; i++) {
            System.out.println("Iteraccion "+(i+1));
            for (int j=1; j < vector.length; j++) {

                if (vector[j] < vector[j - 1]) {
                    //System.out.println("hola"+max);
                    temp = vector[j - 1];
                    vector[j-1] = vector[j];
                    vector[j] = temp;
                    sw = true;
                    System.out.printf("cambiamos vector[%d] = %d por vector[%d] = %d\n",j, vector[j], j-1, vector[j-1]);
                }
            }
            if(!sw) break;
            max++;
        }
        for (int i=0; i <= vector.length -1; i++) {
            System.out.print(vector[i] + ", ");
            if(!sw) System.out.println("vector ordenado de serie");
        }
    }
}
