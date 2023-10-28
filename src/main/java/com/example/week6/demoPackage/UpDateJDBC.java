package com.example.week6.demoPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpDateJDBC {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/week_6?useSSL=false";
        String username = "francis";
        String password = "Wenger123$";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        System.out.println("\nEXECUTING THE UPDATE FOR: Praise\n");

        int rowAffected = statement.executeUpdate("UPDATE customers " +
                "SET phone_number = '09123456741' " +
                "WHERE customer_name = 'Praise' ");
    }
}
