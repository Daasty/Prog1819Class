package ut9.productos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Productos {

    public static void main(String[] args) {

        //Conexión a base de datos:
        String cadCon = "jdbc:mysql://localhost:3306/dam1" +
                "?useUnicode=true&characterEncoding=UTF-8" +
                "&autoReconnect=true&useSSL=false";
        String usuario = "root";
        String passwd = "";


        //Consultas
        String cons = "SELECT * "
                +"FROM PRODUCTOS "
                +"ORDER BY PRECIO DESC";


        try(Connection cn =
                    DriverManager.getConnection(cadCon, usuario, passwd);
        ){

            CallableStatement cst = cn.prepareCall("{call calculos(?)}");
            cst.setBoolean("buscar", true);
            ResultSet rs = cst.executeQuery();

            //CABECERA DEL LISTADO:

            System.out.printf("%-12s %20s %15s %13s\n","Referencia", "Producto", "Precio","Oferta");
            int cont=0;
            while(rs.next()) {

                //Acceso a los campos:
                String referencia = rs.getString("referencia");
                String producto = rs.getString("producto");
                double precio = rs.getDouble("precio");
                boolean oferta = rs.getBoolean("oferta");

                //Tratamiento primera consulta
                System.out.printf("%-20s %-20s %7.2f€ %10s\n",
                        referencia, producto, precio, oferta == true ? "Si" : "No");
                cont++;
            }

            //Pie:
            System.out.println();
            System.out.println("En lista: " + cont + " productos");
            System.out.println();

        }catch (SQLException e) {

            System.out.println("BD >>"+e.getMessage());
        }catch (Exception e) {
            System.out.println("Error> " + e.getMessage());
        }

    }

}
