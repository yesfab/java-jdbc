package com.coding.modulo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Creer {

    static final String green = "\u001B[32m";
    static final String reset = "\u001B[0m";

    public void City(String city, int country_id){
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
            System.out.println(green + "Ville créé" + reset);


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Countries(String country){
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
            System.out.println(green + "Pays créé" + reset);


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Actor(String actor_firstname, String actor_lastname){
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO actor (first_name, last_name)" +
                    "VALUES ('" + actor_firstname.split(" ")[0] + "', '" + actor_lastname.split(" ")[0] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Acteur créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Film(String film_title, String film_description, String film_realease_year, String film_rental_duration, String film_length, String film_replacement_cost, String film_rating, String film_special_features){
    //revoir
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO film (title, description, release_year, rental_duration, rental_rate, length, replacement_cost, rating, special_features)" +
                    "VALUES ('" + film_title.split(" ")[0] + "', '" + film_description.split(" ")[1] + "')" + film_realease_year.split(" ")[2] + "')" + film_rental_duration.split(" ")[3] + "')" + film_length.split(" ")[4] + "')" + film_replacement_cost.split(" ")[5] + "')" + film_rating.split(" ")[6] + "')" + film_special_features.split(" ")[7] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Film créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Film_actor(String film_actor_id, String film_film_id){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO film_actor (actor_id, film_id)" +
                    "VALUES ('" + film_actor_id.split(" ")[0] + "', '" + film_film_id.split(" ")[0] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Film_actor créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Film_category(String film_id_category, String film_category_id){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO film_category (film_id, category_id)" +
                    "VALUES ('" + film_id_category.split(" ")[0] + "', '" + film_category_id.split(" ")[0] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Film_category créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Customers(String customer_firstname, String customer_lastname, String customer_email, String customer_address_id){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO customer (store_id, first_name, last_name, email, address_id)" +
                    "VALUES ('" + customer_firstname.split(" ")[0] + "', '" + customer_lastname.split(" ")[1] + "', '" + customer_email.split(" ")[2] + "', '" + customer_address_id.split(" ")[3] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Client créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Address(String address, String address2, String district, String city_id, String postal_code, String phone){
 //revoir
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO address (address, address2, district, city_id, postal_code, phone)" +
                    "VALUES ('" + address.split(" ")[0] + "', '" + address2.split(" ")[1] + "', '" + district.split(" ")[2] + "', '" + city_id.split(" ")[3] + "', '" + postal_code.split(" ")[4] + phone.split(" ")[5] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Adresse créée" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Staff(String staff_firstname, String staff_lastname, String staff_address_id, String staff_email, String staff_store_id, String staff_username, String staff_password){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO staff (first_name, last_name, address_id, email, store_id, username, password)" +
                    "VALUES ('" + staff_firstname.split(" ")[0] + "', '" + staff_lastname.split(" ")[1] + "', '" + staff_address_id.split(" ")[2] + "', '" + staff_email.split(" ")[3] + "', '" + staff_store_id.split(" ")[4] + staff_username.split(" ")[5] + staff_password.split(" ")[6] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Membre du staff créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Categories(String category_name){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO category (name)" +
                    "VALUES ('" + category_name.split(" ")[0] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Categorie créée" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Language(String language_name){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO language (name)" +
                    "VALUES ('" + language_name.split(" ")[0] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Categorie créée" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Payment(String payment_customer_id, String payment_staff_id, String payment_rental_id, String payment_amount, String payment_date){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO payment (payment_id, customer_id, staff_id, rental_id, amount, payment_date)" +
                    "VALUES ('" + payment_customer_id.split(" ")[0] + "', '" + payment_staff_id.split(" ")[1] + "', '" + payment_rental_id.split(" ")[2] + "', '" + payment_amount.split(" ")[3] + "', '" + payment_date.split(" ")[4] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Paiment créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Rental(String rental_date, String rental_inventory_id, String rental_customer_id, String rental_return_date, String rental_staff_id){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO rental (rental_date, inventory_id, customer_id, return_date, staff_id)" +
                    "VALUES ('" + rental_date.split(" ")[0] + "', '" + rental_inventory_id.split(" ")[1] + "', '" + rental_customer_id.split(" ")[2] + "', '" + rental_return_date.split(" ")[3] + "', '" + rental_staff_id.split(" ")[4] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Location créée" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Store(String store_manager_staff_id, String store_address_id){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO store (manager_staff_id, address_id)" +
                    "VALUES ('" + store_manager_staff_id.split(" ")[0] + "', '" + store_address_id.split(" ")[1] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Magasin créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Inventory(String inventory_film_id, String inventory_store_id){

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            String sql = "INSERT INTO inventory (film_id, store_id)" +
                    "VALUES ('" + inventory_film_id.split(" ")[0] + "', '" + inventory_store_id.split(" ")[1] + "')";
            stmt.executeUpdate(sql);
            System.out.println(green + "Inventaire créé" + reset);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}