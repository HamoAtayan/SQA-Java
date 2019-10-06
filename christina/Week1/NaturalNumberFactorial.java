package Week1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class NaturalNumberFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int input = sc.nextInt();
        factorialCounter(input);
    }

    public static void factorialCounter(int input) {
        if (input == 0) {
            System.out.println("Invalid input!");
        } else {
            long result = 1;
            for (int i = 1; i <= Math.abs(input); i++) result *= i;
            System.out.println("The factorial of " + input + " is " + result);
        }
    }
}
