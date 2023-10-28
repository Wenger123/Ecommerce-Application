package com.example.week6.demoPackage;

import java.sql.DriverManager;

public class Demo {
    public static void main(String[] args) throws Exception {
       Class.forName("com.example.week6.demoPackage.Pqr");

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    }
}

class Pqr{
    static {
        System.out.println("in static");
    }
    // instance
    {
        System.out.println("in instance");
    }
}
