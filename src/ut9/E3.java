package ut9;

import java.sql.*;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        String cadCon = "jdbc:mysql://localhost:3306/prueba" +
                        "?useUnicode=true&characterEncoding=UTF-8" +
                        "&autoReconnect=true&useSSL=false";
        String usuario = "root";
        String passwd = "";
        Scanner teclado = new Scanner(System.in);

        //Hoteles2
        String sql1 = "SELECT * " +
                    "FROM producto " +
                    "WHERE oferta = true AND precio > 80 " +
                    "ORDER BY precio DESC";

        String sql2 = "UPDATE producto SET oferta = true WHERE oferta = false";

        //DEBUG
        System.out.println("Depur > " + sql1);
        System.out.println("Depur > " + sql2);
        System.out.println("--------------------------------------------------------------");


        //Inicio de las operaciones

        try(Connection cn = DriverManager.getConnection(cadCon, usuario, passwd);
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql1);
        ){
            //Cabecera del listado
            System.out.printf("%-12s %-20s %8s %6s\n", "Ref.", "Prod", "Precio", "Oferta");

            //Cuerpo
            int cont = 0;
            while (rs.next()) {
                //Acceso a los campos
                String ref = rs.getString("referencia");
                String prod = rs.getString("producto");
                double precio = rs.getDouble("precio");
                boolean oferta = rs.getBoolean("oferta");

                //Tratamiento
                System.out.printf("%-12s %-20s %7.2fe %6s\n", ref, prod, precio, oferta ? "Si" : "No");
                cont++;
            }

            //Pie
            System.out.println("En lista: " + cont + "productos");
            if (cont > 0) {
                System.out.println("Quitar ofertas?");
                String resp = teclado.nextLine().trim().toLowerCase();
                int cont2 = 0;
                if (resp.length() > 0) { //Tengo algo?
                    if (resp.charAt(0) == 's') { //Te han dicho si?
                        cont2 = st.executeUpdate(sql2);
                    }
                }
                System.out.printf("Se han modificado %d productos", cont2);

            }
        } catch (SQLException e) {
            System.out.println("BD> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }
    }
}
