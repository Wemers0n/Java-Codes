package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection(){
        try {
            final String url = "jdbc:mysql://localhost:3306/mydatabase";
            final String user = "root";
            final String password = "root";

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
