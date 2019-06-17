package ut9.trabajoEV3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Alta {
    public static void alta() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("<<Alta>>");

        System.out.print("Name: ");
        String namev = teclado.nextLine().trim();
        System.out.print("Brand: ");
        String brandv = teclado.nextLine().trim();
        System.out.print("Wattage: ");
        int wattv = Integer.parseInt(teclado.nextLine().trim());
        System.out.print("Minimun Ohm: ");
        double minOhmv = Double.parseDouble(teclado.nextLine().trim());
        System.out.print("Display? (Y/n): ");
        char displayv = teclado.nextLine().trim().charAt(0);
        System.out.print("Internal battery? (Y/n): ");
        char internalBattv = teclado.nextLine().trim().charAt(0);
        System.out.print("Price: ");
        double pricev = Double.parseDouble(teclado.nextLine().trim());

        //Dependiendo de la respuesta establece los booleanos
        boolean displayvBool = false;
        if (displayv == 'y') {
            displayvBool = true;
        }

        boolean internalBattvBool = false;
        if (internalBattv == 'y') {
            internalBattvBool = true;
        }

        //Insercion de datos en la BBDD
        String cons = "INSERT INTO  vapemod VALUES (default,?,?,?,?,?,?,?)";

        try (Connection cn = Connect.connection();
             PreparedStatement ps = cn.prepareStatement(cons)) {

            ps.setString(1, namev);
            ps.setString(2, brandv);
            ps.setInt(3, wattv);
            ps.setDouble(4, minOhmv);
            ps.setBoolean(5, displayvBool);
            ps.setBoolean(6, internalBattvBool);
            ps.setDouble(7, pricev);

            int cont = ps.executeUpdate();
            System.out.printf("Se ha añadido %d mods\n", cont);
        } catch (SQLException e) {
            System.out.println("Error SQL> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }
    }
}
