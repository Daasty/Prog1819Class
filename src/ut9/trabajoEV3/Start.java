package ut9.trabajoEV3;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author daast
 */
public class Start {
    public static void main(String[] args) throws Exception{

        javaArt();

        testBD();

        try {
            Scanner teclado = new Scanner(System.in);

            //Creacion de objetos
            MainMenu mM = new MainMenu();
            VapeDataBase modDB = new VapeDataBase();

            //Lista del menu
            mM.add("Listado");
            mM.add("Alta");
            mM.add("Modificación unitaria");
            mM.add("Modificación grupal");
            mM.add("Baja unitaria");
            mM.add("Baja grupal");
            mM.add("Consulta con cálculos");
            mM.add("Salir");

            //Gestion del menu
            boolean sw = true;
            while (sw) {
                int opcion = mM.ver("Menu: ");
                switch (opcion) {
                    case 1:
                        List.List();
                        break;
                    case 2:
                        Alta.alta();
                        break;
                    case 3:
                        Mods.moduno();
                        break;
                    case 4:
                        Mods.modgrupo();
                        break;
                    case 5:
                        Bajas.bajauno();
                        break;
                    case 6:
                        Bajas.bajagrupo();
                        break;
                    case 7:
                        Query.query();
                        break;
                    default:
                        sw = false;
                        break;
                }
                if (opcion <= 7) {
                    System.out.println(">---Press any button---<");
                    teclado.nextLine();
                }
            }
            System.out.println("End!");
        } catch (SQLException e) {
            System.out.println("Error SQL> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }
    }

    public static void javaArt() throws Exception{
        ASCIIArtGenerator artGen = new ASCIIArtGenerator();
        artGen.generate();
    }

    public static void testBD() {
        try (Connection cn = Connect.connection()) {
            System.out.printf("\n\n");
            System.out.println("##############################");
            System.out.println("DataBase connection -> Working");
            System.out.println("##############################");
            System.out.printf("\n\n");
        } catch (Exception e) {
            System.out.println("Conexión: " + e.getMessage());
        }
    }


}
