package ut8.repaso.edades;

public class Edad {
    private int edad = 0;

    public Edad() {};

    public Edad(int edad) throws Exception{
        setEdad(edad);
    }

    public Edad(Edad e) {
        this.edad = e.edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if (edad < 0 || edad > 120) {
            throw new Exception("La edad debe estar entre 0 y 120");
        }
        else this.edad = edad;
    }

    public String clasificar() {
        if (edad <= 16) {
            return "Escolar";
        }
        else if (edad <= 66) {
            return "Laboral";
        }
        else return "Jubilacion";
    }

    @Override
    public String toString() {
        return "Edad{" +
                "edad=" + edad +
                '}';
    }
}
