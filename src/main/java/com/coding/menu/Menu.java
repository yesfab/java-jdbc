package com.coding.menu;
import com.coding.modulo.*;
import com.coding.modulo.Creer;
import com.coding.modulo.Show;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws SQLException, ParseException {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("");
            System.out.println("Menu principal : ");
            System.out.println("");
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
                    break;
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
            System.out.println("");
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

                    System.out.println("Entrez le nom de la ville : ");
                    String city = action.nextLine();
                    System.out.println("Dans quel pays (id) ? ");
                    String city_country = String.valueOf(Integer.parseInt(action.nextLine()));

                    creer.City(city, Integer.parseInt(city_country));
                    break;
                case 2:
                    Show show = new Show();
                    show.ShowCity();
                    break;
                case 3:
                    Update update = new Update();
                    Update.UpdateCities(update);

                    break;

                case 4:
                    Delete delete = new Delete();
                    Delete.supprCities(delete);
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
            System.out.println("");
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

                    System.out.println("Entrez le nom du pays : ");
                    String pays = action.nextLine();

                    creer.Countries(pays);

                    break;
                case 2:
                    Show show = new Show();
                    show.ShowCountries();
                    break;

                case 3:
                    Update update = new Update();
                    Update.UpdateCountries(update);

                    break;

                case 4:
                    Delete delete = new Delete();
                    Delete.supprCountry(delete);
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
            System.out.println("");
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

                    System.out.println("Entrez le prénom de l'acteur : ");
                    String actor_firstname = action.nextLine();
                    System.out.println("Entrez le nom de l'acteur : ");
                    String actor_lastname = action.nextLine();

                    creer.Actor(actor_firstname, actor_lastname);



                    break;
                case 2:
                    Show show = new Show();
                    show.ShowActor();
                    break;
                case 3:
                    Update update = new Update();
                    Update.UpdateActor(update);

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
            System.out.println("");
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

                    Creer creer = new Creer();

                    System.out.println("Entrez le titre du film : ");
                    String film_title = action.nextLine();
                    System.out.println("Entrez la description du film : ");
                    String film_description = action.nextLine();
                    System.out.println("Entrez l'année du film : ");
                    String film_realease_year = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez la durée de la location du film : ");
                    String film_rental_duration = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez la durée du film : ");
                    String film_length = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez le cout de remplacement du film : ");
                    String film_replacement_cost = action.nextLine();
                    System.out.println("Entrez la note du film : ");
                    String film_rating = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez la special feature du film : ");
                    String film_special_features = action.nextLine();

                    creer.Film(film_title,film_description,film_realease_year,film_rental_duration,film_length,film_replacement_cost,film_rating,film_special_features);


                case 2:
                    Show show = new Show();

                    show.ShowFilm();
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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez l'adresse : ");
                    String address = action.nextLine();
                    System.out.println("Entrez la 2ème adresse (facultatif) : ");
                    String address2 = action.nextLine();
                    System.out.println("Entrez le district : ");
                    String district = action.nextLine();
                    System.out.println("Entrez l'id de la ville : ");
                    String city_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez le code postal de l'adresse : ");
                    String postal_code = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez le numéro de téléphone de l'adresse : ");
                    String phone = String.valueOf(Integer.parseInt(action.nextLine()));

                    creer.Address(address, address2, district, city_id, postal_code, phone);

                case 2:
                    Show show = new Show();

                    show.ShowAddress();
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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez le nom de la catégorie : ");
                    String category_name = action.nextLine();

                    creer.Categories(category_name);

                    break;
                case 2:
                    Show show = new Show();

                    show.ShowCategorie();
                    break;
                case 3:
                    Update update = new Update();
                    Update.UpdateCategory(update);

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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez le prénom du client : ");
                    String customer_firstname = action.nextLine();
                    System.out.println("Entrez le nom du client : ");
                    String customer_lastname = action.nextLine();
                    System.out.println("Entrez l'email du client : ");
                    String customer_email = action.nextLine();
                    System.out.println("Entrez l'id de l'adresse du client : ");
                    String customer_address_id = String.valueOf(Integer.parseInt(action.nextLine()));

                    creer.Customers(customer_firstname, customer_lastname, customer_email, customer_address_id);

                    break;
                case 2:
                    Show show = new Show();
                    show.ShowCustomer();
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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez l'id de l'acteur : ");
                    String film_actor_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id du film : ");
                    String film_film_id = String.valueOf(Integer.parseInt(action.nextLine()));

                    creer.Film_actor(film_actor_id, film_film_id);

                    break;
                case 2:
                    Show show = new Show();
                    show.ShowFilms_actor();
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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez l'id de l'acteur : ");
                    String film_id_category = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id du film : ");
                    String film_category_id = String.valueOf(Integer.parseInt(action.nextLine()));

                    creer.Film_category(film_id_category, film_category_id);

                    break;
                case 2:
                    Show show = new Show();
                    show.ShowFilms_category();
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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez l'id du film dans l'inventaire : ");
                    String inventory_film_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id du magasin où se trouve l'inventaire : ");
                    String inventory_store_id = String.valueOf(Integer.parseInt(action.nextLine()));

                    creer.Inventory(inventory_film_id, inventory_store_id);

                    break;
                case 2:
                    Show show = new Show();
                    show.ShowInventory();
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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez le prénom du membre du staff : ");
                    String staff_firstname = action.nextLine();
                    System.out.println("Entrez le nom du membre du staff : ");
                    String staff_lastname = action.nextLine();
                    System.out.println("Entrez l'id de l'adresse du membre du staff: ");
                    String staff_address_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'email du membre du staff : ");
                    String staff_email = action.nextLine();
                    System.out.println("Entrez l'id du magasin du membre du staff : ");
                    String staff_store_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez le pseudo du membre du staff : ");
                    String staff_username = action.nextLine();
                    System.out.println("Entrez le mot de passe du membre du staff : ");
                    String staff_password = action.nextLine();

                    creer.Staff(staff_firstname, staff_lastname, staff_address_id, staff_email, staff_store_id, staff_username, staff_password);


                    break;
                case 2:
                    Show show = new Show();
                    show.ShowStaff();
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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez le nouveau langage : ");
                    String language_name = action.nextLine();

                    creer.Language(language_name);



                    break;
                case 2:
                    Show show = new Show();
                    show.ShowLanguage();
                    break;

                case 3:
                    Update update = new Update();
                    Update.UpdateLanguage(update);

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

    public static void crudPayment() throws SQLException, ParseException {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("");
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
                    Creer creer = new Creer();

                    SimpleDateFormat date = new SimpleDateFormat(("dd/MM/yyyy"));

                    System.out.println("Entrez l'id du client du paiement' : ");
                    String payment_customer_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id du staff qui a géré le paiement : ");
                    String payment_staff_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id de la location correspondant au paiement : ");
                    String payment_rental_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez le montant du paiement : ");
                    String payment_amount = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez la date du paiement : ");
                    String date_payment = action.nextLine();
                    Date payment_date = date.parse(date_payment);

                    creer.Payment(payment_customer_id, payment_staff_id, payment_rental_id, payment_amount, String.valueOf(payment_date));


                    break;
                case 2:
                    Show show = new Show();
                    show.ShowPayment();
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
            System.out.println("");
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
                    Creer creer = new Creer();

                    System.out.println("Entrez la date de la location : ");
                    String rental_date = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id de l'inventaire de la location : ");
                    String rental_inventory_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id du client correspondant à la location : ");
                    String rental_customer_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez la date de retour de la location : ");
                    String rental_return_date = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id du staff qui a géré la location : ");
                    String rental_staff_id = String.valueOf(Integer.parseInt(action.nextLine()));

                    creer.Rental(rental_date, rental_inventory_id, rental_customer_id, rental_return_date, rental_staff_id);


                    break;
                case 2:
                    Show show = new Show();
                    show.ShowRental();
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
            System.out.println("");
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

                    Creer creer = new Creer();

                    System.out.println("Entrez l'id du manager du staff du magasin : ");
                    String store_manager_staff_id = String.valueOf(Integer.parseInt(action.nextLine()));
                    System.out.println("Entrez l'id de l'adresse du magasin : ");
                    String store_address_id = String.valueOf(Integer.parseInt(action.nextLine()));

                    creer.Store(store_manager_staff_id, store_address_id);



                    break;
                case 2:
                    Show show = new Show();
                    show.ShowStore();
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