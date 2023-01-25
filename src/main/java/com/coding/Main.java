package com.coding;

import java.sql.*;
import java.util.ResourceBundle;

public class Main {
    public Main() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("probleme chargement sur driver");
            System.exit(-1);
        }

        System.out.println("Le driver est chargÃ© !!!");
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        // url de connexion
        String host = bundle.getString("db.host");
        String dbName = bundle.getString("db.dbase");
        String port = bundle.getString("db.port");
        String URL = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
        //
        String username = bundle.getString("db.user");
        String password = bundle.getString("db.pass");
        //
        Connection connection =
                DriverManager.getConnection(URL, username, password);
        if (connection == null) {
            System.err.println("erreur de connexion !!!!");
        } else {
            System.err.println("connexion etablie");

        }
        DatabaseMetaData dbMetaData = connection.getMetaData();
        String productName = dbMetaData.getDatabaseProductName();
        System.out.println("Database: " + productName);
        String productVersion = dbMetaData.getDatabaseProductVersion();
        System.out.println("Version: " + productVersion);

        Statement stmt = connection.createStatement();
    }
}