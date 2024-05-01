package com.mavenshipro.shivani.MySqlservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Mysqlcon {
        public Connection sqlConnection() {
            Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/persons", "root", "root");
                //here Persons is database name, root is username and password
                Statement stmt = con.createStatement();

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            return con;
        }
}
