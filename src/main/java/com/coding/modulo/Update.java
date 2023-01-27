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


            String sql = "UPDATE country SET country = " + country.split(" ")[0] + " WHERE country_id = " + up_city_country;


            System.out.println(green + "La modification a été effectuée" + reset);
            stmt.executeUpdate(sql);
            System.out.println(green + "Pays créé" + reset);


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
