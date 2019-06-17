package ut9.trabajoEV3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author daast
 */

public class Bajas {

    public static void bajauno() {
        Scanner teclado = new Scanner(System.in);

        String cons = "SELECT * FROM vapemod WHERE name like '%s' ORDER BY id";

        System.out.println("[Baja unitaria]");
        System.out.println("Buscar mod (incluya): ");
        String find = teclado.nextLine().trim();

        cons = String.format(cons, "%" + find + "%");
        System.out.println("Consulta> " + cons);

        try (Connection cn = Connect.connection();
             PreparedStatement ps = cn.prepareStatement(cons, ResultSet.TYPE_SCROLL_SENSITIVE,
                     ResultSet.CONCUR_UPDATABLE)

        ) {

            try (ResultSet rs = ps.executeQuery()) {
                int cont = 0, cont2 = 0;

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String brand = rs.getString("brand");
                    int watt = rs.getInt("wattage");
                    double minOhm = rs.getDouble("minOhm");
                    boolean display = rs.getBoolean("display");
                    boolean internalBattery = rs.getBoolean("internalBattery");
                    double precio = rs.getDouble("precio");

                    cont++;
                    System.out.printf("%-3s|%-10s|%-15s|%-8s|%-8s|%-8s|%-8s|%-7s|\n", "Id", "Name", "Brand", "Watt", "MinOhm", "Display", "IntBatt", "Precio");
                    System.out.printf("%-3s|%-10s|%-15s|%-8s|%-8s|%-8s|%-8s|%-7s|\n", id, name, brand, watt, minOhm, display, internalBattery, precio);


                    System.out.println("Delete? (Y/n)");
                    String resp = teclado.nextLine().trim().toLowerCase();
                    if (resp.length() > 0) {
                        if (resp.charAt(0) == 'y') {
                            rs.deleteRow();
                            cont2++;
                            System.out.println("Deleted!");
                        }
                    }

                }
                if (cont == 0) {
                    System.out.println("Not found");
                } else {
                    System.out.printf("%d mods deleted (%d found)\n", cont2, cont);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error SQL> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }
    }

    public static void bajagrupo() {
        System.out.println("[Baja (por grupo)]");

        String cons = "SELECT * FROM vapemod WHERE wattage > ?";
        String cons2 = "DELETE FROM vapemod WHERE wattage > ?";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Consulta> " + cons);

        System.out.print("Wattage: ");
        String find = teclado.nextLine().trim();

        try (
                Connection cn = Connect.connection();
                PreparedStatement ps = cn.prepareStatement(cons);
                PreparedStatement ps2 = cn.prepareStatement(cons2)
        ) {

            ps.setString(1, find);

            try (ResultSet rs = ps.executeQuery()) {
                int cont = 0;
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String brand = rs.getString("brand");
                    int watt = rs.getInt("wattage");
                    double minOhm = rs.getDouble("minOhm");
                    boolean display = rs.getBoolean("display");
                    boolean internalBattery = rs.getBoolean("internalBattery");
                    double precio = rs.getDouble("precio");


                    if (cont == 0) {
                        System.out.printf("%-3s|%-10s|%-15s|%-8s|%-8s|%-8s|%-8s|%-7s|\n", "Id", "Name", "Brand", "Watt", "MinOhm", "Display", "IntBatt", "Precio");
                    }

                    System.out.printf("%-3s|%-10s|%-15s|%-8s|%-8s|%-8s|%-8s|%-7s|\n", id, name, brand, watt, minOhm, display, internalBattery, precio);
                    cont++;
                }
                if (cont > 0) {
                    System.out.println("Delete? (Y/n)");
                    String resp = teclado.nextLine().trim().toLowerCase();
                    if (resp.length() > 0) {
                        if (resp.charAt(0) == 'y') {
                            ps2.setString(1, find);
                            int deleted = ps2.executeUpdate();
                            System.out.printf("%d deleted\n", deleted);
                        }
                    }
                } else {
                    System.out.println("Not found");
                }
            }


        } catch (SQLException e) {
            System.out.println("Error SQL> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }
    }
}
