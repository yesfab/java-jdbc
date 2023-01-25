package com.coding.menu;


import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu principal : ");
            System.out.println("1. Villes");
            System.out.println("2. Pays");
            System.out.println("3. Acteurs");
            System.out.println("4. Films");
            System.out.println("5. Clients");
            System.out.println("6. Adresses");
            System.out.println("7. Staff");
            System.out.println("8. Quitter");

            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch(choice) {
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
                    crudCustomers();
                    break;
                case 6:
                    crudAddress();
                    break;
                case 7:
                    crudStaff();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Choix non valide. Réessayez.");
            }
        }
    }

    public static void crudCities() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Ville : ");
            System.out.println("1. Créer une nouvelle ville");
            System.out.println("2. Afficher les villes");
            System.out.println("3. Mettre à jour une ville");
            System.out.println("4. Supprimer une ville");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

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

    public static void crudCountries() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Pays : ");
            System.out.println("1. Créer une nouveau pays");
            System.out.println("2. Afficher les pays");
            System.out.println("3. Mettre à jour un pays");
            System.out.println("4. Supprimer un pays");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

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

    public static void crudActors() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Acteurs : ");
            System.out.println("1. Créer un nouvel acteur");
            System.out.println("2. Afficher les acteurs");
            System.out.println("3. Mettre à jour un acteur");
            System.out.println("4. Supprimer un acteur");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

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

    public static void crudFilms() {

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

            switch (choice) {
                case 1:

                    break;
                case 2:

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

    public static void crudCustomers() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Customers : ");
            System.out.println("1. Créer un nouveau client");
            System.out.println("2. Afficher les clients");
            System.out.println("3. Mettre à jour un client");
            System.out.println("4. Supprimer un client");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

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

    public static void crudAddress() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Adresses : ");
            System.out.println("1. Créer une nouvelle adresse");
            System.out.println("2. Afficher les adresses");
            System.out.println("3. Mettre à jour une adresse");
            System.out.println("4. Supprimer une adresse");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

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

    public static void crudStaff() {

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

            switch (choice) {
                case 1:

                    break;
                case 2:

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
