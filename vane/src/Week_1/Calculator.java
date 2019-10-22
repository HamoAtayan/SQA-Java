package Week_1;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber, secondNumber;
        char operation;

        System.out.println("Enter first number:");
        firstNumber = sc.nextDouble();

        System.out.println("Enter second number:");
        secondNumber = sc.nextDouble();

        System.out.println("operation:");
        operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '/': {
                if (secondNumber == 0) {
                    System.out.println("Invalid input");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            }
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
        }
    }
}
