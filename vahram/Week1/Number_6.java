package Week1;

import java.util.Scanner;

public class Number_6 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter random number:");
        int randomNumber;
        while ((randomNumber = scaner.nextInt()) != 0) {
            giveNextPrime(randomNumber);
        }
        if (randomNumber == 0) {
            System.out.println("Done!");
        }
    }
    public static boolean isPrime(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void giveNextPrime(int input) {
        for (int i = 1; i < input; i++) {
            boolean checkPrime = !isPrime(input);
            if (checkPrime) {
                input++;
            }
        }
        System.out.println("The next prime number is " + input);
    }
}
