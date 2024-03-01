package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnection.getConnection();

        String createTable = "CREATE TABLE users(" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(30)" +
                ")";

        String teste = "teste";

        String insertTable = "INSERT INTO users(nome) VALUES (?)";

//        Statement smt = connection.createStatement();
//        smt.execute(insertTable);
        PreparedStatement smt = connection.prepareStatement(insertTable);

        smt.setString(1, teste);
        smt.execute();

        System.out.println("success");

        connection.close();
    }
}
