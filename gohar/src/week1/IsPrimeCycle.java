package main.java.gohar;

import java.util.Scanner;

public class IsPrimeCycle {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        int n;
        while((n = scanner.nextInt()) != 0) {
            giveNextPrime(n);
        }
    }

    public static boolean isParz(int a) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    static void giveNextPrime(int n) {
        while (!isParz(n)) {
            n++;
        }
        System.out.println("Next prime number is: " + n);

    }
}
