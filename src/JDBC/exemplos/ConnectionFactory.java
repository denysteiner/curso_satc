package jdbc.exemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Klaus Boeing
 */

public class ConnectionFactory {
    private Connection con;
    
    public Connection getConnection() {
        try {
            if (con==null) {
//                con = DriverManager.getConnection("jdbc:derby:C:\\Java\\BancoDeDadosNetBeans\\banco", "usuario", "senhausuario");
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/contato;", "user", "user");
//                con = DriverManager.getConnection("jdbc:odbc:teste", "dba", "sql");
            }
            return con;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
