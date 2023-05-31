package org.lessons.java;

public class DisplayFizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Numbers multiples of both 3 and 5
            if (i % 15 == 0) System.out.println("FizzBuzz");
            // Numbers multiples of 3
            else if(i % 3 == 0) System.out.println("Fizz");
            // Numbers multiples of 5
            else if (i % 5 == 0) System.out.println("Buzz");
            // Numbers NOT multiples of 3, 5 or both
            else System.out.println(i);
        }

    }
}
