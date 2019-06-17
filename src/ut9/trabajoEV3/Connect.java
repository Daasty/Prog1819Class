package ut9.trabajoEV3;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * @author daast
 */

public class Connect {
    public static Connection connection() throws SQLException{
        String cadCon = "jdbc:mysql://localhost:3306/dam1" +
                "?useUnicode=true&characterEncoding=UTF-8" +
                "&autoReconnect=true&useSSL=false";

        String usuario = "root";
        String passwd = "";

        return DriverManager.getConnection(cadCon, usuario, passwd);

    }
}
