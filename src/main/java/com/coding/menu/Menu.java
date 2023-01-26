package com.coding.menu;
import com.coding.modulo.*;
import com.coding.modulo.Creer;
import com.coding.Main;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Villes");
            System.out.println("2. Pays");
            System.out.println("3. Acteurs");
            System.out.println("4. Films");
            System.out.println("5. Quitter");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    crudCities();
                    break;
                case 2:
                    crudCountries();
                    break;
                case 3:
                    crudActors();
                    break;
                case 4:
                    crudFilms();
                    break;
                case 5:
                    exit = true;
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void crudCities() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Créer une nouvelle ville");
            System.out.println("2. Afficher les villes");
            System.out.println("3. Mettre à jour une ville");
            System.out.println("4. Supprimer une ville");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            Scanner action = new Scanner(System.in);


            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quel ville voulez vous creer ? ");
                    String ville = action.nextLine();

                    creer.City(ville, 1);

                    break;
                case 2:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }

        }

    }

    public static void crudCountries() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Créer une nouveau pays");
            System.out.println("2. Afficher les pays");
            System.out.println("3. Mettre à jour un pays");
            System.out.println("4. Supprimer un pays");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            Scanner action = new Scanner(System.in);

            switch (choice) {

                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quel pays voulez vous creer ? ");
                    String pays = action.nextLine();

                    creer.Countries(pays);
                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowCountries(Spays);
                    break;
                case 3:
                    break;

                case 4:
                    Delete delete = new Delete();
                    Delete.supprCountry();
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudActors() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Créer un nouvel acteur");
            System.out.println("2. Afficher les acteurs");
            System.out.println("3. Mettre à jour un acteur");
            System.out.println("4. Supprimer un acteur");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:

                    Creer creer = new Creer();

                    System.out.println("Quel Acteur voulez vous creer ? ");
                    String actor = action.nextLine();

                    creer.Actor(actor);

                    break;
                case 2:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudFilms() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Créer un nouveau film");
            System.out.println("2. Afficher les films");
            System.out.println("3. Mettre à jour un film");
            System.out.println("4. Supprimer un film");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }


}
