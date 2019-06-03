package utils;

import java.sql.*;

/**
 * Created by Anil on 5/3/2016.
 */
public final class DatabaseConnection {

    private final String username = "root";
    private final String password = "";

    private final String url = "jdbc:mysql://localhost:3306/demo";

    Connection connection = null;

    public DatabaseConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!!");
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public final Connection getConnection() {
        return connection;
    }

    public final Statement getStatement() throws SQLException {
        return connection.createStatement();
    }

    public final PreparedStatement getPreparedStatement(String query) throws SQLException {
        return connection.prepareStatement(query);
    }

/*
    public static void main(String[] args) {
        new DatabaseConnection();
    }*/
}
