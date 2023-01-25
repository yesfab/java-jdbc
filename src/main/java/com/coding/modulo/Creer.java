package com.coding.modulo;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Creer {

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
}
