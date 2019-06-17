package ut9.trabajoEV3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author daast
 */

public class List {

    public static void List() {
        String cons = "SELECT * FROM vapemod ORDER BY id";

        try (Connection cn = Connect.connection();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(cons)) {
            System.out.println("<<Listado>>");
            System.out.printf("%-3s|%-10s|%-15s|%-8s|%-8s|%-8s|%-8s|%-7s|\n", "Id", "Name", "Brand", "Watt", "MinOhm", "Display", "IntBatt", "Precio");
            int cont = 0;

            while (rs.next()) {
                int id = rs.getInt("Id");
                String name = rs.getString("name");
                String brand = rs.getString("brand");
                int watt = rs.getInt("wattage");
                double minOhm = rs.getDouble("minOhm");
                boolean display = rs.getBoolean("display");
                boolean internalBattery = rs.getBoolean("internalBattery");
                double precio = rs.getDouble("precio");

                System.out.printf("%-3s|%-10s|%-15s|%-8s|%-8s|%-8s|%-8s|%-7s|\n", id, name, brand, watt, minOhm, display, internalBattery, precio);
                cont++;
            }
            System.out.println("\nHay " + cont + " mods.");

        } catch (SQLException e) {
            System.out.println("Error SQL> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error > " + e.getMessage());
        }
    }
}
