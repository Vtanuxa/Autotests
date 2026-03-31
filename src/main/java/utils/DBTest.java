package utils;

import java.sql.*;

public class DBTest {

    static String sqlSelect = "Select * FROM clients";
    static String connectionURL = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String password = "9999";

    public static String getUser() {

        try {
            Connection connection = DriverManager.getConnection(connectionURL, user, password);
            PreparedStatement ps = connection.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String username = rs.getString("username");
                String lastName = rs.getString("password");
                return username + lastName;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "error" + throwables.getMessage();
        }
        return null;
    }

}
