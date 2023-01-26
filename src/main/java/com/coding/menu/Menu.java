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
            System.out.println("16. Quitter");

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
                    Creer creer = new Creer();

                    System.out.println("Quel ville voulez vous creer ? ");
                    String ville = action.nextLine();

                    creer.City(ville, 1);

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
                    Creer creer = new Creer();

                    System.out.println("Quel pays voulez vous creer ? ");
                    String pays = action.nextLine();

                    creer.Country(pays);

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
                    Creer creer = new Creer();

                    System.out.println("Quel acteur voulez vous creer ? ");
                    String actor = action.nextLine();

                    creer.Actor(actor);

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
                    Creer creer = new Creer();

                    System.out.println("Quel film voulez vous creer ? ");
                    String film = action.nextLine();

                    creer.Film(film);

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

    public static void crudFilms_actor() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer un nouveau acteur de film");
            System.out.println("2. Afficher les acteurs de film");
            System.out.println("3. Mettre à jour un acteur de film");
            System.out.println("4. Supprimer un acteur de film");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quel acteur de film voulez vous creer ? ");
                    String film_actor = action.nextLine();

                    creer.Films_actor(film_actor);

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

    public static void crudFilms_category() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer une nouvelle catégorie de film");
            System.out.println("2. Afficher les catégories de film");
            System.out.println("3. Mettre à jour une catégorie de film");
            System.out.println("4. Supprimer une catégorie de film");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quel catégorie de film voulez vous creer ? ");
                    String film_category = action.nextLine();

                    creer.Film_category(film_category);

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
                    Creer creer = new Creer();

                    System.out.println("Quel client voulez vous creer ? ");
                    String customer = action.nextLine();

                    creer.Customer(customer);

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
                    Creer creer = new Creer();

                    System.out.println("Quelle adresse voulez vous creer ? ");
                    String address = action.nextLine();

                    creer.Address(address);

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
                    Creer creer = new Creer();

                    System.out.println("Quel membre du staff voulez vous creer ? ");
                    String staff = action.nextLine();

                    creer.Staff(staff);

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

    public static void crudCategories() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer une nouvelle catégorie");
            System.out.println("2. Afficher les catégories");
            System.out.println("3. Mettre à jour une catégorie");
            System.out.println("4. Supprimer une catégorie");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quelle catégorie voulez vous creer ? ");
                    String category = action.nextLine();

                    creer.Category(category);

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

    public static void crudLanguage() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer un nouveau langage");
            System.out.println("2. Afficher les langages");
            System.out.println("3. Mettre à jour un langage");
            System.out.println("4. Supprimer un langage");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quel langage voulez vous creer ? ");
                    String language = action.nextLine();

                    creer.Language(language);

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

    public static void crudPayment() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer un nouveau paiement");
            System.out.println("2. Afficher les paiements");
            System.out.println("3. Mettre à jour un paiement");
            System.out.println("4. Supprimer un paiement");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quel paiement voulez vous creer ? ");
                    String payment = action.nextLine();

                    creer.Payment(payment);

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

    public static void crudRental() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer une nouvelle location");
            System.out.println("2. Afficher les locations");
            System.out.println("3. Mettre à jour une location");
            System.out.println("4. Supprimer une location");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quelle location voulez vous creer ? ");
                    String rental = action.nextLine();

                    creer.Rental(rental);

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

    public static void crudStore() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer un nouveau magasin");
            System.out.println("2. Afficher les magasins");
            System.out.println("3. Mettre à jour un magasin");
            System.out.println("4. Supprimer un magasin");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quel magasin voulez vous creer ? ");
                    String store = action.nextLine();

                    creer.Store(store);

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

    public static void crudInventory() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu de la table Films : ");
            System.out.println("1. Créer un nouveau inventaire");
            System.out.println("2. Afficher les inventaires");
            System.out.println("3. Mettre à jour un inventaire");
            System.out.println("4. Supprimer un inventaire");
            System.out.println("5. Retour");
            System.out.print("Entre ton choix : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Creer creer = new Creer();

                    System.out.println("Quel inventaire voulez vous creer ? ");
                    String inventory = action.nextLine();

                    creer.Inventory(inventory);

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
