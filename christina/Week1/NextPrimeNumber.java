package Week1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class NextPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int input;
        while ((input = sc.nextInt()) != 0) {
            giveNextPrime(input);
        }
        if (input == 0) {
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


