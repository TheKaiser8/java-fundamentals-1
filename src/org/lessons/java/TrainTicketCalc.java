package org.lessons.java;

import java.util.Scanner;

public class TrainTicketCalc {
    public static void main(String[] args) {
        // Declare a Scanner variable to get user input
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Inserisci il numero di km che vuoi percorrere: ");
        int distance = inputUser.nextInt();
        System.out.print("Inserisci la tua età: ");
        int userAge = inputUser.nextInt();

        double pricePerKm = 0.21;
        double ticketPrice = distance * pricePerKm;
        double discount20 = 0.2;
        double discount40 = 0.4;

        // Define discount conditions
        if (userAge <= 18) {
            ticketPrice -= ticketPrice * discount20;
            System.out.println("Il costo del tuo biglietto scontato del " + (discount20 * 100) + "% è: "  + ticketPrice + "€");
        } else if (userAge > 65) {
            ticketPrice -= ticketPrice * discount40;
            System.out.println("Il costo del tuo biglietto scontato del " + (discount40 * 100) + "% è: " + ticketPrice + "€");
        } else System.out.println("Il costo del tuo biglietto è: " + ticketPrice + "€");
    }
}
