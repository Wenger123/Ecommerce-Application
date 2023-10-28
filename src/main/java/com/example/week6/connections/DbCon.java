package com.example.week6.connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbCon {
    private static Connection connection = null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_cart","francis","Wenger123$");
            System.out.print("connected");
        }
        return connection;
    }
}

//package com.example.week6.connections;
//
//import java.sql.*;
//
//public class DbCon {
//    private static Connection connection;
//    public static void main(String[] args) throws SQLException {
//        String username = "francis";
//        String password = "Wenger123$";
////        String query = "insert into category values (3,'Books')";
//
//        connection = DriverManager.getConnection(
//                                "jdbc:mysql://localhost:3306/week_6?useSSL=false",
//                                 username, password);
//
//        Statement statement = connection.createStatement();
////        int count = statement.executeUpdate(query);
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
//
//        while (resultSet.next()){
//            int id = resultSet.getInt("customer_id");
//            String name = resultSet.getString("customer_name");
//            String email = resultSet.getString("email");
//            String passWord = resultSet.getString("password");
//            String phone_number = resultSet.getString("phone_number");
//
//            System.out.printf("%-5s %-18s %-25s %-18s %-12s \n", id,name,email,passWord,phone_number);
//        }
//
////        System.out.println(count + "row/s affected");
//
//        connection.close();
//        statement.close();
////        resultSet.close();
//    }
//}
