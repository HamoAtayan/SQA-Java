import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please insert positive integer: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput <= 0) {
            System.out.println("Your input is not a positive integer ");
        } else {
            int factorialTotal = 1;
            for (int i = 1; i <= userInput; i++) {
                factorialTotal = factorialTotal * i;
            }

            System.out.println("Factorial for number: " + userInput + " is equal to: " + factorialTotal);
        }
    }
}
