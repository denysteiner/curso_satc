package jdbc.exemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Klaus Boeing
 */

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/contato;", "user", "user");
//            return DriverManager.getConnection(
//                    "jdbc:derby:C:\\Java\\BancoDeDadosNetBeans\\banco", "usuario", "senhausuario");
//            return DriverManager.getConnection(
//                    "jdbc:odbc:teste", "dba", "sql");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
