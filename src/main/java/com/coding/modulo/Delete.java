package com.coding.modulo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    public static void supprCountry() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connexion établie!");

            //Créer l'objet statement
            Statement stmt = conn.createStatement();

            //Requete d'insertion
            String sql = "DELETE FROM country " + " WHERE ";

            stmt.executeUpdate(sql);
            System.out.println("Pays supprimé");


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
