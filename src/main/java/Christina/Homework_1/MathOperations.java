package Christina.Homework_1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class MathOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();

        sumBetweenNumbersCounter(firstNumber, secondNumber);
        averageSumCounter(firstNumber, secondNumber);
    }

    public static void sumBetweenNumbersCounter(int firstNumber, int secondNumber) {
        int max = 0, min = 0, sumBetweenNumbers = 0;
        max = Math.max(firstNumber, secondNumber);
        min = Math.min(firstNumber, secondNumber);

        if (firstNumber - secondNumber == 0) {
            System.out.println("The entered numbers are equal to each other!");
        } else {
            for (int i = min; i <= max; i++) {
                sumBetweenNumbers += i;
            }
            System.out.println("The sum between entered numbers is " + sumBetweenNumbers);
        }
    }

    public static void averageSumCounter(double firstNumber, double secondNumber) {
        double averageSum = (firstNumber + secondNumber) / 2;
        System.out.println("The average of entered numbers is " + averageSum);
    }
}
