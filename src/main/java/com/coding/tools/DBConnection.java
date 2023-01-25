package com.coding.tools;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Classe de service permettant d'obtenir un objet connexion
 * - La connexion s'effectue en lisant un fichier properties qui doit contenir tous les éléments
 * permettant la connexion : login, password, dbase, etc ...
 */
public class DBConnection {

    private static Connection connection;
    private static Properties properties;

    public static Properties getProperties(String fileName) {
        if ( properties == null )
            properties = getFileProperties(fileName);
        return properties;
    }


    public static Connection getConnection(String fileName) throws SQLException {
        if (connection == null) {
            // Build URL
            var p =  getProperties(fileName);
            String host = p.getProperty("db.host");
            String dbName = p.getProperty("db.dbase");
            String dbport = p.getProperty("db.port");
            String URL = "jdbc:mysql://" + host + ":" + dbport + "/" + dbName;
            // get Login
            String username = p.getProperty("db.user");
            String password = p.getProperty("db.pass");
            // get password
            connection =
                    DriverManager.getConnection(URL, username, password);
        }
        return connection;
    }

    public static Connection getConnection() throws SQLException {
        return getConnection("application.properties");
    }


    private static Properties getFileProperties(String fileName) {
        System.out.println("file properties name :" + fileName);
        Properties props = new Properties();
        FileReader input ;
        try {
            input = new FileReader(fileName);
            props.load(input);
        } catch (IOException e) {
            System.err.println("Error lors du chargement des properties :" + e.getMessage());
        }
        // for debug
        props.list(System.out);
        return props;
    }
}