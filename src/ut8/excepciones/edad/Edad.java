package ut8.excepciones.edad;

import java.util.Scanner;

public class Edad {
    //Atributos
    private int edad = 18;

    public Edad() {
    }

    //Puede producir errores
    public Edad(int edad) throws Exception {
        this.setEdad(edad);
    }

    public Edad(Edad e) {
        this.edad = edad;
    }

    //Puede producir errores
    public void setEdad(int edad) throws Exception {

        if (edad < 0 || edad > 120) {
            throw new Exception("La edad debe ser entre 0 y 120");
        }

        if (edad % 2 != 0) {
            throw new Exception("La edad debe ser par");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }


    @Override
    public String toString() {
        return "Edad{" +
                "edad=" + edad +
                '}';
    }

    public String clasificar() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Edad: ");
            int edad = Integer.parseInt(teclado.nextLine());

            if (edad <= 16) {
                return  "Edad escolar";
            } else if (edad <= 66) {
                return "Edad laboral";
            } else return "Jubilacion";
    }
}
