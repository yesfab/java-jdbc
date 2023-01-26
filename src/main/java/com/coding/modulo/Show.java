package com.coding.modulo;

import java.sql.*;

public class Show {


    public static void ShowCity(String citys) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet citys= stmt.executeQuery("SELECT city FROM city");
            ResultSetMetaData resultMeta = citys.getMetaData();
            while(citys.next()) {
                for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println(" ville: " + citys.getObject(i).toString());
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

    public static void ShowCity(String city) throws SQLException {
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
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void ShowActor(String actor) throws SQLException {
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
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowAddress(String address) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet adresse= stmt.executeQuery("SELECT title FROM film");
            ResultSetMetaData resultMeta = adresse.getMetaData();
            while(adresse.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("adresse: "+ adresse.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowFilm(String film) throws SQLException {
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
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowCategorie(String categorie) throws SQLException {
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
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowCustomer(String customer) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet client= stmt.executeQuery("SELECT first_name, last_name, email FROM customer");

            while(client.next()){
                String firstName = client.getString("first_name");
                String lastName = client.getString("last_name");
                String email = client.getString("email");
                System.out.println("client :"+firstName + " " + lastName+ ", email:"+ email);
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowFilms_actor(String Films_actor) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet fa= stmt.executeQuery("SELECT * FROM film_actor");
            ResultSetMetaData resultMeta = fa.getMetaData();
            while(fa.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("acteur_film: "+ fa.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowFilms_category(String Films_category) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet fc= stmt.executeQuery("SELECT * FROM film_category");
            ResultSetMetaData resultMeta = fc.getMetaData();
            while(fc.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("film_category: "+ fc.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowInventory(String inventory) throws SQLException {
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
            ResultSetMetaData resultMeta = inventaire.getMetaData();
            while(inventaire.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("inventaire: "+ inventaire.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ShowStaff(String staff) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet pays= stmt.executeQuery("SELECT first_name, last_name  FROM staff");
            ResultSetMetaData resultMeta = pays.getMetaData();
            while(pays.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("personnel: "+ pays.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void ShowLanguage(String languaga) throws SQLException {
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
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void ShowPayment(String payment) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet pays= stmt.executeQuery("SELECT * FROM payment");
            ResultSetMetaData resultMeta = pays.getMetaData();
            while(pays.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("paiement: "+ pays.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void ShowRental(String rental) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet location= stmt.executeQuery("SELECT * FROM rental");
            ResultSetMetaData resultMeta = location.getMetaData();
            while(location.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("location: "+ location.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void ShowStore(String store) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet magazin= stmt.executeQuery("SELECT * FROM store");
            ResultSetMetaData resultMeta = magazin.getMetaData();
            while(magazin.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.println("magazin: "+ magazin.getObject(i).toString());
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}