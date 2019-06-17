package ut9.hoteles;

import java.sql.*;

public class Hoteles3 {
    public static void main(String[] args) {
        //Cadena de conexion
        String cadCon = "jdbc:mysql://localhost:3306/dam1" +
                "?useUnicode=true&characterEncoding=UTF-8" +
                "&autoReconnect=true&useSSL=false";
        String usuario = "root";
        String passwd = "";

        String cons = "SELECT * FROM hoteles WHERE precio BETWEEN ? AND ?";

        try(Connection cn = DriverManager.getConnection(cadCon, usuario, passwd);
            PreparedStatement ps = cn.prepareStatement(cons)){
            //Asignar valor a los parametros
            ps.setDouble(1, 100);
            ps.setDouble(2, 150);

            try(ResultSet rs = ps.executeQuery()) {
                System.out.printf("%2s %-15s %7s %7s %7s\n", "Id", "Nombre", "Precio", "Estrellas", "Wifi");
                int cont  = 0;
                while (rs.next()) {
                    int id = rs.getInt("Id");
                    String nom = rs.getString("Nombre");
                    double precio = rs.getDouble("precio");
                    int estrellas = rs.getInt("Estrellas");
                    boolean wifi = rs.getBoolean("Wifi");

                    System.out.printf("%2s %-15s %7s %7s %7s\n", id, nom, precio, estrellas, wifi ? "Si" : "No");
                    cont++;
                }


            }
        } catch (SQLException e){
            System.out.println("SQL > " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error > " + e.getMessage());
        }
    }
}
