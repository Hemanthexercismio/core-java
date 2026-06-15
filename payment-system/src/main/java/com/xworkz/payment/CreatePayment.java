package com.xworkz.payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePayment {
    public static void main(String[] args) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        String url = "jdbc:mysql://localhost:3306/hemanthdb";
        String username = "root";
        String password = "hemanth@mysql";
        String sqlQuery =
                "insert into payment_info values(1001, 'Priya', 5000.00, 'UPI', '2026-06-10')";
        Connection connect = null;
        Statement statement = null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            statement.execute(sqlQuery);
            System.out.println("Data inserted Successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connect != null) {
                try {
                    connect.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}



