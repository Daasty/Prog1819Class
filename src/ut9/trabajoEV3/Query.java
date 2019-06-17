package ut9.trabajoEV3;

import java.sql.*;

/**
 * @author daast
 */

public class Query {
    public static void query() {
        try (
                Connection cn = Connect.connection();
                CallableStatement cs = cn.prepareCall("{call precioMedio}");
                ResultSet rs = cs.executeQuery()
        ) {
            System.out.println("[Consulta]");
            System.out.printf("%-18s", "Precio Medio: ");
            while (rs.next()) {
                double precio = rs.getDouble("Precio Medio");

                System.out.printf("%7.0f mods\n", precio);
            }


        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }

    }

}
