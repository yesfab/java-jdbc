package com.coding;

import javax.sound.sampled.Line;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    private static HashMap<Integer,Actions> actions;

    public static void main(String[] args) throws IOException, InterruptedException {




        Scanner scanner = new Scanner(System.in) ;

    }

    private static int menu(Scanner scanner) {
        Integer number = null;
        System.out.println("Quelle forme voulez-vous dessiner (CR=Sortie) ? : ");
        System.out.println("1. Villes");
        System.out.println("2. Pays");
        System.out.println("3. Acteurs");

        while(number == null) {
            number = dialogForNumber(scanner);

        }
        return number;
    }

    private static int dialogForNumber(Scanner scanner){
        int n ;
        while(true) {
            var rep = scanner.nextLine();
            if (rep.isEmpty()) {
                return 0;
            } else {
                try {
                    n = Integer.valueOf(rep);
                    break;
                } catch (NumberFormatException e) {
                    System.err.printf("Entrez une valeur numérique >>> %s%n",rep);
                }
            }
        }
        return n;
    }


}
