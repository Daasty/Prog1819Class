package ut9.productos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class PBListadoCallble {

    public static void main(String[] args) {
        //Conexión a base de datos:
        String cadCon = "jdbc:mysql://localhost:3306/dam1" +
                "?useUnicode=true&characterEncoding=UTF-8" +
                "&autoReconnect=true&useSSL=false";
        String usuario = "root";
        String passwd = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("busca (incluye): ");

        //Añadimos el patron el valor que nos ha dado el usuario
        String bprod = "%" + teclado.nextLine().trim() + "%";

        System.out.println("precio (inferior a):");
        double bpre = Double.parseDouble(teclado.nextLine());

        try(
                Connection cn = DriverManager.getConnection(cadCon,usuario,passwd);
                CallableStatement cs =
                        cn.prepareCall("{ call listadoFiltrado(?,?) }");
        ){
            //Carga de párametros (según tipo)
            cs.setString(1, bprod);
            cs.setDouble(2, bpre);

            try(ResultSet rs = cs.executeQuery()){

                //Cabecera:
                System.out.printf("%-12s %20s %15s %13s\n","Referencia", "Producto", "Precio","Oferta");

                //Cuerpo:
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
            }//try sin catch....
        } catch (Exception e) {
            System.out.println("Error >> "+e.getMessage());
        }


    }

}
