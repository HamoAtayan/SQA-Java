package Week1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Type first number:");
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();

        System.out.println("Type second number:");
        double second = sc.nextDouble();

        System.out.println("Type operation:");
        char operation = sc.next().charAt(0);

        calculateTheNumbers(first, operation, second);
    }

    public static void calculateTheNumbers(double first, char operation, double second) {
        switch (operation) {
            case '+':
                System.out.println(first + "+" + second + "=" + (first + second));
                break;
            case '-':
                System.out.println(first + "-" + second + "=" + (first - second));
                break;
            case '*':
                System.out.println(first + "*" + second + "=" + (first * second));
                break;
            case '/': {
                if (second == 0) {
                    System.out.println("The operation cannot be done");
                } else {
                    System.out.println(first + "/" + second + "=" + (first / second));
                }
            }
            default:
                System.out.println("Invalid input:");
        }
    }
}

