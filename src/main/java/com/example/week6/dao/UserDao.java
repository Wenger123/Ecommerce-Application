package com.example.week6.dao;

import com.example.week6.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private Connection con;

    private String query;
    private PreparedStatement pst;
    private ResultSet rs;

    public UserDao(Connection con) {
        this.con = con;
    }

    public User userLogin(String email, String password) {
        User user = null;
        try {
            query = "SELECT * FROM users WHERE email=? AND password=?";
            pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return user;
    }

    public User getUserByEmail(String email) {
        User user = null;
        try {
            query = "SELECT * FROM users WHERE email=?";
            pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            rs = pst.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return user;
    }

    public boolean createUser(User newUser) throws SQLException {
        String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, newUser.getName());
            pst.setString(2, newUser.getEmail());
            pst.setString(3, newUser.getPassword());

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0; // If rowsAffected > 0, the user was created successfully.
        }
    }
}




//package com.example.week6.dao;
//
//import com.example.week6.model.User;
//
//import java.sql.*;
//
//public class UserDao {
//    private Connection con;
//
//    private String query;
//    private PreparedStatement pst;
//    private ResultSet rs;
//
//    public UserDao(Connection con) {
//        this.con = con;
//    }
//
//    public User userLogin(String email, String password) {
//        User user = null;
//        try {
//            query = "select * from users where email=? and password=?";
//            pst = this.con.prepareStatement(query);
//            pst.setString(1, email);
//            pst.setString(2, password);
//            rs = pst.executeQuery();
//            if(rs.next()){
//                user = new User();
//                user.setId(rs.getInt("id"));
//                user.setName(rs.getString("name"));
//                user.setEmail(rs.getString("email"));
//            }
//        } catch (SQLException e) {
//            System.out.print(e.getMessage());
//        }
//        return user;
//    }
//}
