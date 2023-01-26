package com.coding.modulo;

import java.sql.*;

public class Show {

    public static void ShowCity(String country) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet city= stmt.executeQuery("SELECT city FROM city");
            ResultSetMetaData resultMeta = city.getMetaData();
            while(city.next()) {
                for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println(" ville: " + city.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowCountries(String country) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet pays= stmt.executeQuery("SELECT country FROM country");
            ResultSetMetaData resultMeta = pays.getMetaData();
            while(pays.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("pays: "+ pays.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}