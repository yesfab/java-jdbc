package com.coding.modulo;

import java.sql.*;

public class Show {

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

            ResultSet pays= stmt.executeQuery("SELECT city FROM city");
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

            ResultSet pays= stmt.executeQuery("SELECT actor FROM actor");
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

    public static void ShowAddress(String film) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion

            ResultSet pays= stmt.executeQuery("SELECT title FROM film");
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

            ResultSet pays= stmt.executeQuery("SELECT title FROM film");
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

            ResultSet pays= stmt.executeQuery("SELECT name FROM category");
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

            ResultSet pays= stmt.executeQuery("SELECT firts_name,last_name,email FROM customer");
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

            ResultSet pays= stmt.executeQuery("SELECT * FROM film_actor");
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

            ResultSet pays= stmt.executeQuery("SELECT * FROM film_category");
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

            ResultSet pays= stmt.executeQuery("SELECT * FROM inventory");
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
                    System.out.println("pays: "+ pays.getObject(i).toString());
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
                    System.out.println("pays: "+ pays.getObject(i).toString());
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
                    System.out.println("pays: "+ pays.getObject(i).toString());
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

            ResultSet pays= stmt.executeQuery("SELECT * FROM rental");
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

            ResultSet pays= stmt.executeQuery("SELECT * FROM store");
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