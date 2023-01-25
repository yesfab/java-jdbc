package com.coding;

import com.coding.tools.DBConnection;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class Main {
    private static final String VERSION = "1.0";
    public static void main(String[] args) throws SQLException {
        System.out.println(String.format("========= Main DBConnection Version (%s) ===========",VERSION));
        DatabaseMetaData dbMetaData = DBConnection.getConnection().getMetaData();
        String productName = dbMetaData.getDatabaseProductName();
        System.out.println("Database: " + productName);
        String productVersion = dbMetaData.getDatabaseProductVersion();
        System.out.println("Version: " + productVersion);
    }
}
