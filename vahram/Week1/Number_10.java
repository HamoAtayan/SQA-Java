package Week1;

import java.util.Scanner;

public class Number_10 {
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
        int sumBetweenNumbers = 0;
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);

        if (firstNumber - secondNumber == 0) {
            System.out.println("The entered numbers are equal to each other!");
        } else {
            for (int i = min + 1; i < max; i++) {
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
