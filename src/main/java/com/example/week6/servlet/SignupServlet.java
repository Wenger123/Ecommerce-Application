package com.example.week6.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.example.week6.connections.DbCon;
import com.example.week6.dao.UserDao;
import com.example.week6.model.User;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("full-name");
            String email = request.getParameter("signup-email");
            String password = request.getParameter("signup-password");

            if (email != null && !email.isEmpty()) { // Check if email is not null or empty
                // Check if the email is already registered
                UserDao udao = new UserDao(DbCon.getConnection());
                User existingUser = udao.getUserByEmail(email);

                if (existingUser == null) {
                    // If the email is not registered, create a new user
                    User newUser = new User();
                    newUser.setName(name);
                    newUser.setEmail(email);
                    newUser.setPassword(password);

                    boolean isUserCreated = udao.createUser(newUser);

                    if (isUserCreated) {
                        // Redirect to the login page after successful signup
                        response.sendRedirect("login.jsp"); // Adjust the URL as needed
                    } else {
                        out.println("Signup failed. Please try again.");
                    }
                } else {
                    // If the email is already registered, show an error message
                    out.println("Email already exists. Please use a different email or log in.");
                }
            } else {
                // Handle the case where email is null or empty
                out.println("Email cannot be null or empty. Please provide a valid email.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Add debugging statements here
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}


