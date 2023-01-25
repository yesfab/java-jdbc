package com.codingf;
import java.sql.*;
import java.util.Scanner;
import * ;

public class Sakila {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/sakila";

    //  Database credentials
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query
            stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                System.out.println("1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        create(stmt);
                        break;
                    case 2:
                        read(stmt);
                        break;
                    case 3:
                        update(stmt);
                        break;
                    case 4:
                        delete(stmt);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } while (choice != 5);

            // Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        System.out.println("Goodbye!");
    }

    public static void create(Statement stmt) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the table: ");
        String table = sc.nextLine();
        System.out.print("Enter the columns you want to insert data into: ");
        String columns = sc.nextLine();
        System.out.print("Enter the values you want to insert: ");
        String values = sc.nextLine();
        String sql = "INSERT INTO " + table + " (" + columns + ") VALUES (" + values + ")";
        stmt.executeUpdate(sql);
        System.out.println("Record created successfully.");
    }

    public static void read(Statement stmt) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the table: ");
        String table = sc.nextLine();
        System.out.print("Enter the columns you want to select: ");
        String columns = sc.nextLine();
        String sql = "SELECT " + columns + " FROM " + table;
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            //Retrieve by column name
            for (String col : columns.split(",")) {
                System.out.print(rs.getString(col) + " ");
            }
            System.out.println();
        }
        System.out.println("Read operation completed successfully.");
        rs.close();
    }

    public static void update(Statement stmt) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the table: ");
        String table = sc.nextLine();
        System.out.print("Enter the column and value you want to update: ");
        String set = sc.nextLine();
        System.out.print("Enter the condition to update the record: ");
        String where = sc.nextLine();
        String sql = "UPDATE " + table + " SET " + set + " WHERE " + where;
        stmt.executeUpdate(sql);
        System.out.println("Record updated successfully.");
    }

    public static void delete(Statement stmt) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the table: ");
        String table = sc.nextLine();
        System.out.print("Enter the condition to delete the record: ");
        String where = sc.nextLine();
        String sql = "DELETE FROM " + table + " WHERE " + where;
        stmt.executeUpdate(sql);
        System.out.println("Record deleted successfully.");
    }
}
