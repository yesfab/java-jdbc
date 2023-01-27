package com.coding.modulo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

    static final String green = "\u001B[32m";
    static final String reset = "\u001B[0m";

    public static void supprCountry(Delete delete) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        Scanner action = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion
            System.out.println("Entrez l'id du pays à supprimer : ");
            String del_country = String.valueOf(Integer.parseInt(action.nextLine()));

            try {
                String sql = "DELETE FROM country WHERE country_id = '" + del_country + "'";
                stmt.executeUpdate(sql);
                System.out.println(green+"Pays supprimé"+reset);
            }
            catch (SQLException e) {
                System.err.println("Cet élément est déjà utilisé comme clé étrangère dans une autre table !");
            }




            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void supprCities(Delete delete) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        Scanner action = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion
            System.out.println("Entrez l'id de la ville à supprimer : ");
            String del_city = String.valueOf(Integer.parseInt(action.nextLine()));

            try {
                String sql = "DELETE FROM city WHERE city_id = '" + del_city + "'";
                stmt.executeUpdate(sql);
                System.out.println(green+"Ville supprimé"+reset);
            }
            catch (SQLException e) {
                System.err.println("Cet élément est déjà utilisé comme clé étrangère dans une autre table !");
            }




            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}