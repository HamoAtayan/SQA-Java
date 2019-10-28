package Week1;

import java.util.Scanner;

public class Number_5 {
    public static void main(String[] args) {
        boolean isPrime = true;
                while (isPrime) {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Enter random number:");
            double input = scaner.nextDouble();
            if (input == 0) {
                System.out.println("The number is not a prime.");
            } else if (input % 1 == 0) {
                boolean termCondition = true;
                for (int i = 2; i <= input; i++) {
                    if (input % i == 0 && input != i) {
                        termCondition = false;
                        break;
                    }
                }
                if (termCondition == true) {
                    System.out.println("The number is prime.");
                    isPrime = false;
                } else {
                    System.out.println("The number is not a prime.");
                }


            }
        }

    }
}

