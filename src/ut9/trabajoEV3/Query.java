package ut9.trabajoEV3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * @author daast
 */

public class Query {
    public static void query() {
        try {
            Connection cn = Connect.connection();
            CallableStatement cs = cn.prepareCall("{call precioMedio}");

            ResultSet rs = cs.executeQuery();


            System.out.println("[Consulta]");
            System.out.printf("%-18s", "Precio Medio: ");
            while (rs.next()) {
                double precio = rs.getDouble("Precio Medio");

                System.out.printf("%3.0f euros\n", precio);
            }

        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }

    }
}
