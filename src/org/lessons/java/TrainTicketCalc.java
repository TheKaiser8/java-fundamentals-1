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

        // Define discount conditions
        if (userAge <= 18) {
            ticketPrice -= ticketPrice * 0.2;
            System.out.println("Il costo del tuo biglietto scontato del 20% è : " + ticketPrice + "€");
        } else if (userAge > 65) {
            ticketPrice -= ticketPrice * 0.4;
            System.out.println("Il costo del tuo biglietto scontato del 40% è : " + ticketPrice + "€");
        } else System.out.println("Il costo del tuo biglietto è : " + ticketPrice + "€");
    }
}
