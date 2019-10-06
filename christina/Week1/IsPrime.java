package Week1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class IsPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        String expression = "The input is not a prime.";
        while (isPrime) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number:");
            double input = sc.nextDouble();
            if (input == 0) {
                System.out.println(expression);
            } else if (input % 1 == 0) {
                boolean termCondition = true;
                for (int i = 2; i <= input; i++) {
                    if (input % i == 0 && input != i) {
                        termCondition = false;
                        break;
                    }
                }
                if (termCondition == true) {
                    System.out.println("The input is prime.");
                    isPrime = false;
                } else {
                    System.out.println(expression);
                }
            } else {
                System.out.println(expression);
            }

        }
    }

}



