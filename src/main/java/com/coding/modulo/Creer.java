package com.coding.modulo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Creer {


    public static void City(String city, int country_id) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        System.out.println(city +" "+ country_id);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = String.format("INSERT INTO city (city,country_id) values(\"%s\", %d)",city, country_id);


            stmt.executeUpdate(sql);
            System.out.println("ville crée");


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public static void Countries(String country) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO country (country) " +
                    "VALUES ('" + country + "')";
            stmt.executeUpdate(sql);
            System.out.println("Pays crée");


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
