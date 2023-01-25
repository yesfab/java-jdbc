package com.coding.actions;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
    public static void Update(Statement stmt) throws SQLException {
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
}
