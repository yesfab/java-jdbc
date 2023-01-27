package com.coding.modulo;

import java.sql.*;

public class Show {

    public static void ShowCountries() throws SQLException {
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
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowCity() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet ville= stmt.executeQuery("SELECT city FROM city");
            ResultSetMetaData resultMeta = ville.getMetaData();
            while(ville.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("ville: "+ ville.getObject(i).toString());
                }
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void ShowActor() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet acteur= stmt.executeQuery("SELECT first_name, last_name FROM actor");

            while(acteur.next()){
                String firstName = acteur.getString("first_name");
                String lastName = acteur.getString("last_name");
                System.out.println("acteur:"+firstName + " " + lastName);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowAddress() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet adresse= stmt.executeQuery("SELECT address, district, city_id, postal_code, phone FROM address");

            while(adresse.next()){
                String address1 = adresse.getString("address");
                String city_id = adresse.getString("city_id");
                String district = adresse.getString("district");
                String postal_code = adresse.getString("postal_code");
                String phone = adresse.getString("phone");
                System.out.println("adresse:"+address1 + ", district:" + district+ ", ville:"+city_id+ ", postal:"+postal_code+ ", phone:"+phone);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowFilm() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet films= stmt.executeQuery("SELECT title FROM film");

            while(films.next()){
                String title = films.getString("title");
                System.out.println("film:"+title );
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowCategorie() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet category= stmt.executeQuery("SELECT name FROM category");
            ResultSetMetaData resultMeta = category.getMetaData();
            while(category.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("categorie: "+ category.getObject(i).toString());
                }
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowCustomer() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet client= stmt.executeQuery("SELECT first_name, last_name, email, address_id FROM customer");

            while(client.next()){
                String firstName = client.getString("first_name");
                String lastName = client.getString("last_name");
                String email = client.getString("email");
                String address_id = client.getString("address_id");
                System.out.println("client :"+firstName + " " + lastName+ ", email: "+ email+", "+ address_id);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowFilms_actor() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet fa= stmt.executeQuery("SELECT actor_id, film_id FROM film_actor");

            while(fa.next()){
                String actor_id = fa.getString("actor_id");
                String film_id = fa.getString("film_id");
                System.out.println("acteur de film :"+actor_id + ", " + film_id);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowFilms_category() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet fc= stmt.executeQuery("SELECT film_id, category_id FROM film_category");

            while(fc.next()){
                String film_id = fc.getString("film_id");
                String category_id = fc.getString("category_id");
                System.out.println("categorie de film :"+film_id + ", " + category_id);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowInventory() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet inventaire= stmt.executeQuery("SELECT * FROM inventory");

            while(inventaire.next()){
                String film_id= inventaire.getString("film_id");
                String store_id = inventaire.getString("store_id");
                System.out.println("inventaire, film id :"+ film_id+ ", magazin id: " + store_id);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowStaff() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet staff1= stmt.executeQuery("SELECT first_name, last_name  FROM staff");

            while(staff1.next()){
                String first_name= staff1.getString("first_name");
                String last_name = staff1.getString("last_name");
                System.out.println("staff :"+ first_name+ " " + last_name);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void ShowLanguage() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet pays= stmt.executeQuery("SELECT name FROM language");
            ResultSetMetaData resultMeta = pays.getMetaData();
            while(pays.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("langage: "+ pays.getObject(i).toString());
                }
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void ShowPayment() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet rental= stmt.executeQuery("SELECT rental_id,amount FROM payment");

            while(rental.next()){
                String rental_id= rental.getString("rental_id");
                String amount = rental.getString("amount");
                System.out.println("location id :"+ rental_id+ ", paiement: " + amount);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void ShowRental() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet location= stmt.executeQuery("SELECT inventory_id, customer_id FROM rental");

            while(location.next()){
                String inventory_id= location.getString("inventory_id");
                String customer_id = location.getString("customer_id");
                System.out.println("location, inventaire id :"+ inventory_id+ ", client id: " + customer_id);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void ShowStore() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet magazin= stmt.executeQuery("SELECT manager_staff_id, address_id FROM store");

            while(magazin.next()){
                String manager_staff_id= magazin.getString("manager_staff_id");
                String address_id = magazin.getString("address_id");
                System.out.println("magazin, manageur id :"+ manager_staff_id+ ", adresse id: " + address_id);
                System.out.println("==========================================================================================");
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }


}