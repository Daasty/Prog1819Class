package ut9.hoteles;

import java.sql.*;

public class Hoteles2 {

    public static void main(String[] args) {
        //Cadena de conexion
        String cadCon = "jdbc:mysql://localhost:3306/dam1" +
                "?useUnicode=true&characterEncoding=UTF-8" +
                "&autoReconnect=true&useSSL=false";
        String usuario = "root";
        String passwd = "";

        //Hoteles2
        String cons = "SELECT * FROM hoteles ORDER BY precio DESC";

        try(Connection cn = DriverManager.getConnection(cadCon, usuario, passwd);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);) {
            System.out.printf("%2s %-15s %7s %7s %7s\n", "Id", "Nombre", "Precio", "Estrellas", "Wifi");
            int cont = 0;

            while (rs.next()) {
                //Acceso a datos
                int ide = rs.getInt("id");
                String nom = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int estrellas = rs.getInt("estrellas");
                boolean wifi = rs.getBoolean("wifi");

                //Tratamiento

                System.out.printf("%2s %-15s %7s %7s %7s\n", ide, nom, precio, estrellas, wifi ? "Si" : "No");
                cont++;
            }
        }catch (SQLException e) {
            System.out.println("SQL >" + e.getMessage());
        }catch (Exception e) {
            System.out.println("Error >" + e.getMessage());
        }
    }
}
