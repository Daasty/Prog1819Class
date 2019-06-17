package ut9.trabajoEV3;

import java.sql.*;
import java.util.Scanner;

/**
 * @author daast
 */

public class Mods {
    public static void moduno() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("[Modificación unitaria]");

        System.out.println("Buscar nombre mod que empiece por: ");
        String find = teclado.nextLine().trim();

        String cons = "SELECT * FROM vapemod WHERE name like '%s' ORDER BY id";

        cons = String.format(cons, find + "%");
        System.out.println("Consulta> " + cons);

        try (Connection cn = Connect.connection();
             Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = st.executeQuery(cons)) {
            int cont = 0, mods = 0;
            while (rs.next()) {

                String name = rs.getString("name");
                String brand = rs.getString("brand");
                int watt = rs.getInt("wattage");
                double minOhm = rs.getDouble("minOhm");
                boolean display = rs.getBoolean("display");
                boolean internalBattery = rs.getBoolean("internalBattery");
                double precio = rs.getDouble("precio");

                cont++;
                System.out.printf("%-10s: %s\n", "Name: ", name);
                System.out.printf("%-10s: %s\n", "Brand: ", brand);
                System.out.printf("%-10s: %s\n", "Wattage: ", watt);
                System.out.printf("%-10s: %s\n", "Min Ohm: ", minOhm);
                System.out.printf("%-10s: %s\n", "Display: ", display);
                System.out.printf("%-15s: %s\n", "InternalBatt: ", internalBattery);
                System.out.printf("%-10s: %.2f euros\n", "Precio", precio);

                System.out.print("¿Modificar? (Y/n)");
                String resp = teclado.nextLine().trim().toLowerCase();
                if (resp.length() > 0) {
                    if (resp.charAt(0) == 'y') {
                        String data = "";
                        char dataBool = 'n';

                        System.out.printf("Name? [%s ]", name);
                        data = teclado.nextLine().trim();
                        if (data.length() > 0) {
                            rs.updateString("name", data);
                        }

                        System.out.printf("Brand? [%s ]", brand);
                        data = teclado.nextLine().trim();
                        if (data.length() > 0) {
                            rs.updateString("brand", data);
                        }

                        System.out.printf("Wattage? [%s ]", watt);
                        data = teclado.nextLine().trim();
                        if (data.length() > 0) {
                            rs.updateString("wattage", data);
                        }

                        System.out.printf("Minimun Ohm? [%s ]", minOhm);
                        data = teclado.nextLine().trim();
                        if (data.length() > 0) {
                            rs.updateString("minOhm", data);
                        }

                        System.out.printf("Display?(Y/n) [%s ]", name);
                        dataBool = teclado.nextLine().trim().charAt(0);

                        if (dataBool == 'y') {
                            rs.updateString("display", String.valueOf(1));
                        } else rs.updateString("display", String.valueOf(0));


                        System.out.printf("Internal Battery?(Y/n) [%s ]", name);
                        dataBool = teclado.nextLine().trim().charAt(0);
                        if (data.length() > 0) {
                            if (dataBool == 'y') {
                                rs.updateString("internalBattery", String.valueOf(1));
                            } else rs.updateString("internalBattery", String.valueOf(0));

                        }
                        System.out.printf("Precio? [%.2f euros]", precio);
                        data = teclado.nextLine().trim();
                        if (data.length() > 0) {
                            rs.updateDouble("precio", Double.parseDouble(data));
                        }

                        rs.updateRow();
                        System.out.println("\nMods done!\n");
                        mods++;
                    }
                }
            }
            System.out.printf("%d found.\n", cont);
            System.out.printf("%d moded.\n", mods);

        } catch (SQLException e) {
            System.out.println("BD> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }
    }

    public static void modgrupo() {
        Scanner teclado = new Scanner(System.in);
        String cons = "SELECT * FROM vapemod WHERE precio < ? ORDER BY id";
        String cons2 = "UPDATE vapemod SET precio = precio + 10 WHERE precio < ?";

        System.out.println("[Modificación grupal]");
        System.out.println("Consulta> " + cons2);
        System.out.print("Precio inferior a: ");
        double find = Double.parseDouble(teclado.nextLine());
        try (Connection cn = Connect.connection();
             PreparedStatement ps = cn.prepareStatement(cons);
             PreparedStatement ps2 = cn.prepareStatement(cons2)) {
            System.out.printf("%-3s|%-10s|%-15s|%-8s|%-8s|%-8s|%-8s|%-7s|\n", "Id", "Name", "Brand", "Watt", "MinOhm", "Display", "IntBatt", "Precio");
            ps.setDouble(1, find);
            ps2.setDouble(1, find);

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

                    System.out.printf("%-3s|%-10s|%-15s|%-8s|%-8s|%-8s|%-8s|%-7s|\n", id, name, brand, watt, minOhm, display, internalBattery, precio);
                    cont++;
                }

                if (cont > 0) {
                    System.out.println(cont + " mods");
                    System.out.print("Apply new price (+10)? (Y/n) ");
                    String resp = teclado.nextLine().trim().toLowerCase();
                    int cont2 = 0;
                    if (resp.length() > 0) {
                        if (resp.charAt(0) == 'y') {
                            cont2 = ps2.executeUpdate();
                        }
                    }

                    System.out.printf("%d mods modded\n", cont2);

                } else {
                    System.out.println("\nNot found");
                }
            }

        } catch (SQLException e) {
            System.out.println("BD> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }
    }

}
