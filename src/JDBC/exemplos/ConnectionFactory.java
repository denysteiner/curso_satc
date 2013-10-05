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
                    "jdbc:derby:C:\\Java\\BancoDeDadosNetBeans\\banco", "usuario", "senhausuario");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
