package Lilia;

import java.util.Scanner;

public class CheckIfNumberIsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        boolean isPrime = true;
        if (number == 0 || number == 1) {
            System.out.println("NotAPrimeNumber");
        }
        for (int i = 2; i < number; i++) {
            isPrime=(number % i != 0);
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

    }
}
