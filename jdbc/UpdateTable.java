package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnection.getConnection();

        String sql = "UPDATE users SET NOME = 'Maria' WHERE id = 1";
        String DeleteId = "DELETE FROM users WHERE id = 3";

        Statement smt = connection.createStatement();
        smt.execute(DeleteId);

        System.out.println("success");
        connection.close();
    }
}
