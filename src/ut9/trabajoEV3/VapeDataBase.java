package ut9.trabajoEV3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author daast
 */

public class VapeDataBase {
    private Scanner teclado = new Scanner(System.in);

    public VapeDataBase() throws SQLException {
        this.connect();
    }

    public Connection connect() throws SQLException {
        String cadCon = "jdbc:mysql://localhost:3306/dam1"
                + "?useUnicode=true&characterEncoding=UTF-8"
                + "&autoReconnect=true&useSSL=false";

        String usuario = "root";
        String passwd = "";

        return DriverManager.getConnection(cadCon, usuario, passwd);
    }
}
