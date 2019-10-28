package Week1;

import java.util.Scanner;

public class Number_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int input = scanner.nextInt();
        factorialCounter(input);
    }

    public static void factorialCounter(int input) {
        if (input == 0) {
            System.out.println("Invalid input");
        } else {
            long result = 1;
            for (int i = 1; i <= Math.abs(input); i++) result *= i;
            System.out.println("The factorial of " + input + " is " + result);
        }
    }
}
