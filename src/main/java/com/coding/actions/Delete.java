package com.coding.actions;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

    public static void Delete(Statement stmt) throws SQLException {
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
