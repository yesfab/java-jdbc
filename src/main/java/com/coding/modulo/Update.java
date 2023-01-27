package com.coding.modulo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

    static final String green = "\u001B[32m";
    static final String reset = "\u001B[0m";


    Scanner sc = new Scanner(System.in);

    public static void UpdateCountries(Update update){
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

            System.out.println("Entrez l'id du pays à modifier : ");
            String up_city_country = String.valueOf(Integer.parseInt(action.nextLine()));
            System.out.println("Entrez le nouveau nom du pays : ");
            String country = action.nextLine();

            System.out.println("UPDATE country SET country = " + country + " WHERE country_id = " + up_city_country);

            String sql = "UPDATE country SET country = '" + country + "' WHERE country_id = " + up_city_country;

            stmt.executeUpdate(sql);
            System.out.println(green + "La modification a été effectuée" + reset);




            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void UpdateCities(Update update){
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

            System.out.println("Entrez l'id de la ville à modifier : ");
            String up_city_country = String.valueOf(Integer.parseInt(action.nextLine()));
            System.out.println("Entrez le nouveau nom de la ville : ");
            String city = action.nextLine();

            System.out.println("UPDATE city SET city = " + city + " WHERE city_id = " + up_city_country);

            String sql = "UPDATE city SET city = '" + city + "' WHERE city_id = " + up_city_country;

            stmt.executeUpdate(sql);
            System.out.println(green + "La modification a été effectuée" + reset);




            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void UpdateActor(Update update){
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

            System.out.println("Entrez l'id de l'acteur à modifier : ");
            String up_actor = String.valueOf(Integer.parseInt(action.nextLine()));
            System.out.println("Entrez le nouveau prenom de l'acteur : ");
            String first_name = action.nextLine();
            System.out.println("Entrez le nouveau nom de l'acteur : ");
            String last_name = action.nextLine();


            System.out.println("UPDATE actor SET first_name = '" + first_name + "', last_name = "+last_name + " WHERE actor_id = '" + up_actor + "'");

            String sql = "UPDATE actor SET first_name = '" + first_name + "', last_name = '" + last_name + "' WHERE actor_id = '" + up_actor + "'";

            stmt.executeUpdate(sql);
            System.out.println(green + "La modification a été effectuée" + reset);




            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void UpdateCategory(Update update){
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

            System.out.println("Entrez l'id de la categorie à modifier : ");
            String up_category = String.valueOf(Integer.parseInt(action.nextLine()));
            System.out.println("Entrez le nouveau nom de la categorie : ");
            String cat = action.nextLine();

            System.out.println("UPDATE category SET name = " + cat + " WHERE category_id = " + up_category);

            String sql = "UPDATE category SET name = '" + cat + "' WHERE category_id = " + up_category;

            stmt.executeUpdate(sql);
            System.out.println(green + "La modification a été effectuée" + reset);




            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void UpdateLanguage(Update update){
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

            System.out.println("Entrez l'id du langage à modifier : ");
            String up_language = String.valueOf(Integer.parseInt(action.nextLine()));
            System.out.println("Entrez le nouveau langage : ");
            String lan = action.nextLine();

            System.out.println("UPDATE language SET name = " + lan + " WHERE language_id = " + up_language);

            String sql = "UPDATE language SET name = '" + lan + "' WHERE language_id = " + up_language;

            stmt.executeUpdate(sql);
            System.out.println(green + "La modification a été effectuée" + reset);




            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}