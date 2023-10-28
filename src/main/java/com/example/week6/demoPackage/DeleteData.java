package com.example.week6.demoPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/week_6?useSSL=false";
        String username = "francis";
        String password = "Wenger123$";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        System.out.println("\nEXECUTING THE DELETE FOR: Chisom\n");

        int rowAffected = statement.executeUpdate("DELETE FROM customers " +
                "WHERE customer_name = 'Chisom' " );
    }
}
