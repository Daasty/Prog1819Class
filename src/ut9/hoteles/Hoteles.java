package ut9.hoteles;

import java.sql.*;

public class Hoteles {
    public static void main(String[] args) {

        //Cadena de conexion
        String cadCon = "jdbc:mysql://localhost:3306/dam1" +
                "?useUnicode=true&characterEncoding=UTF-8" +
                "&autoReconnect=true&useSSL=false";
        String usuario = "root";
        String passwd = "";

        //Hoteles2 que se manda a la bbdd
        String cons = "SELECT * FROM hoteles ORDER BY nombre";

        //Try catch con la conexion
        try(Connection cn = DriverManager.getConnection(cadCon, usuario, passwd);
        Statement st = cn.createStatement(); // Envia la consulta a la bbdd
        ResultSet rs = st.executeQuery(cons);) { //Trata los datos de la consulta

            //Cabecera
            System.out.printf("%5s %-15s %7s %5s %5s\n", "Id", "Hotel", "Precio", "Est.", "Wifi");
            int cont = 0;
            while (rs.next()) {
                //Acceso a los campos
                int id = rs.getInt("id");
                String nom = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int estrellas = rs.getInt("estrellas");
                boolean wifi = rs.getBoolean("Wifi");

                //Tratamiento
                System.out.printf("%5s %-15s %7s %5s %5s\n", id, nom, precio, estrellas, wifi == true ? "Si" : "No");
                cont++;
            }
            System.out.println("En lista: " + cont + " hoteles");

        } catch(SQLException e) {
            System.out.println("BD> " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Error > " + e.getMessage());
        }
    }
}
