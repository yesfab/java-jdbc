package com.coding.menu;
import com.coding.modulo.*;
import com.coding.modulo.Creer;
import com.coding.modulo.Show;
import com.coding.Main;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu principal : ");
            System.out.println("1. Villes");
            System.out.println("2. Pays");
            System.out.println("3. Acteurs");
            System.out.println("4. Films");
            System.out.println("5. Films_actor");
            System.out.println("6. Films_category");
            System.out.println("7. Clients");
            System.out.println("8. Adresses");
            System.out.println("9. Staff");
            System.out.println("10. Categories");
            System.out.println("11. Langage");
            System.out.println("12. Paiement");
            System.out.println("13. Location");
            System.out.println("14. Magasin");
            System.out.println("15. Inventaire");

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
                    crudFilms_actor();
                    break;
                case 6:
                    crudFilms_category();
                    break;
                case 7:
                    crudCustomers();
                    break;
                case 8:
                    crudAddress();
                    break;
                case 9:
                    crudStaff();
                    break;
                case 10:
                    crudCategories();
                    break;
                case 11:
                    crudLanguage();
                    break;
                case 12:
                    crudPayment();
                    break;
                case 13:
                    crudRental();
                case 14:
                    crudStore();
                    break;
                case 15:
                    crudInventory();
                    break;
                case 16:
                    exit = true;
                    break;

                case 17:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void crudCities() throws SQLException {
        //f

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
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowCity(Spays);
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
        //f

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
                    Delete Delete = new Delete();
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
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowActor(Spays);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }


    public static void crudFilms() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer un nouveau film");
            System.out.println("2. Afficher les films");
            System.out.println("3. Mettre à jour un film");
            System.out.println("4. Supprimer un film");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);


            switch (choice) {
                case 1:

                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowFilm(Spays);
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }
    public static void crudAddress() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table des adresse : ");
            System.out.println("1. Créer une nouvelle adresse");
            System.out.println("2. Afficher les adresses");
            System.out.println("3. Mettre à jour une adresse");
            System.out.println("4. Supprimer une adresse");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);


            switch (choice) {
                case 1:

                case 2:
                    Show show = new Show();

                    String Spays = action.nextLine();
                    show.ShowAddress(Spays);
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }



    public static void crudCategories() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu des categories");
            System.out.println("1. Créer une nouvelle categorie");
            System.out.println("2. Afficher les categories");
            System.out.println("3. Mettre à jour une categorie");
            System.out.println("4. Supprimer une categorie");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:

                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowCategorie(Spays);
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudCustomers() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table clients : ");
            System.out.println("1. Créer un nouveau client");
            System.out.println("2. Afficher les clients");
            System.out.println("3. Mettre à jour un client");
            System.out.println("4. Supprimer un client");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:

                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowCustomer(Spays);
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudFilms_actor() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table acteur de Film : ");
            System.out.println("1. Créer un nouveau acteur de film");
            System.out.println("2. Afficher les acteurs de film");
            System.out.println("3. Mettre à jour un acteur de film");
            System.out.println("4. Supprimer un acteur de film");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:

                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowFilms_actor(Spays);
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudFilms_category() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table categorie de Films : ");
            System.out.println("1. Créer une nouvelle categorie de film");
            System.out.println("2. Afficher les categories de film");
            System.out.println("3. Mettre à jour une categorie de film");
            System.out.println("4. Supprimer une categorie de film");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:

                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowFilms_category(Spays);
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudInventory() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Créer un nouvel inventaire");
            System.out.println("2. Afficher les inventaires");
            System.out.println("3. Mettre à jour un inventaire");
            System.out.println("4. Supprimer un inventaire");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:

                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowInventory(Spays);
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudStaff() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println("Menu de la table Staff : ");
            System.out.println("1. Créer un nouveau membre du staff");
            System.out.println("2. Afficher les membres du staff");
            System.out.println("3. Mettre à jour un membre du staff");
            System.out.println("4. Supprimer un membre du staff");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:


                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowStaff(Spays);
                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudLanguage() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table langage : ");
            System.out.println("1. Créer un nouveau langage");
            System.out.println("2. Afficher les langages");
            System.out.println("3. Mettre à jour un langage");
            System.out.println("4. Supprimer un langage");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:


                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowLanguage(Spays);
                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudPayment() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table paiement : ");
            System.out.println("1. Créer un nouveau paiement");
            System.out.println("2. Afficher les paiements");
            System.out.println("3. Mettre à jour un paiement");
            System.out.println("4. Supprimer un paiement");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:


                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowPayment(Spays);
                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudRental() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table location : ");
            System.out.println("1. Créer une nouvelle location");
            System.out.println("2. Afficher les locations");
            System.out.println("3. Mettre à jour une location");
            System.out.println("4. Supprimer une location");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:


                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowRental(Spays);
                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }

    }

    public static void crudStore() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table magasin : ");
            System.out.println("1. Créer un nouveau magasin");
            System.out.println("2. Afficher les magasins");
            System.out.println("3. Mettre à jour un magasin");
            System.out.println("4. Supprimer un magasin");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();
            Scanner action = new Scanner(System.in);

            switch (choice) {
                case 1:


                    break;
                case 2:
                    Show show = new Show();
                    String Spays = action.nextLine();
                    show.ShowStore(Spays);
                    break;

                case 3:

                    break;
                case 4:

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