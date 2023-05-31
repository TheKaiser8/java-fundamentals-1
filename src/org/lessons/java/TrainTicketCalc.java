package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicketCalc {
    public static void main(String[] args) {
        // Declare a Scanner variable to get user input
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Inserisci il numero di km che vuoi percorrere: ");
        int distance = inputUser.nextInt();
        System.out.print("Inserisci la tua età: ");
        int userAge = inputUser.nextInt();

        // Define variables values
        double pricePerKm = 0.21;
        double ticketPrice = distance * pricePerKm;
        double discount = 0.0;
        double discount20 = 0.2;
        double discount40 = 0.4;

        // Define discount conditions
        if (userAge <= 18) discount = discount20;
        else if (userAge > 65) discount = discount40;

        // Calculate ticket price
        ticketPrice -= ticketPrice * discount;

        DecimalFormat decimalFormat = new DecimalFormat(".00");
        String formattedTicketPrice = decimalFormat.format(ticketPrice);

        if (discount > 0) System.out.println("Il costo del tuo biglietto scontato del " + ((int) (discount * 100)) + "% è: "  + formattedTicketPrice + "€");
        else System.out.println("Il costo del tuo biglietto intero è: " + formattedTicketPrice + "€");
    }
}
