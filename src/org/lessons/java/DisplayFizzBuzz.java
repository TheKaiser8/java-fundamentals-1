package org.lessons.java;

import java.util.Scanner;

public class DisplayFizzBuzz {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Inserisci quanti numeri vuoi stampare (minimo 1 e massimo 999): ");
        int numbersPrintUser = inputUser.nextInt();

        if (numbersPrintUser > 0 && numbersPrintUser < 1000) {
            for (int i = 1; i <= numbersPrintUser; i++) {
                // Numbers multiples of both 3 and 5
                if (i % 15 == 0) System.out.println("FizzBuzz");
                    // Numbers multiples of 3
                else if(i % 3 == 0) System.out.println("Fizz");
                    // Numbers multiples of 5
                else if (i % 5 == 0) System.out.println("Buzz");
                    // Numbers NOT multiples of 3, 5 or both
                else System.out.println(i);
            }
        } else System.out.println("Valore non valido. Inserisci un numero compreso tra 1 e 999");
    }
}
