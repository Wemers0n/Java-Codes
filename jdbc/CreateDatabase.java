package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws SQLException {

        Connection connection = DbConnection.getConnection();
//
//        Statement statement = connection.createStatement();
//        statement.execute("CREATE DATABASE teste");
//        // statement.execute("DROP DATABASE teste");

        System.out.println("success");
    }
}
