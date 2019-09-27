package Christina.Homework_1;

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
        if (operation == '+') {
            System.out.println(String.valueOf(first) + "+" + String.valueOf(second) + "=" + String.valueOf(first + second));
        } else if (operation == '-') {
            System.out.println(String.valueOf(first) + "-" + String.valueOf(second) + "=" + String.valueOf(first - second));
        } else if (operation == '*') {
            System.out.println(String.valueOf(first) + "*" + String.valueOf(second) + "=" + String.valueOf(first * second));
        } else if (operation == '/') {
            System.out.println(String.valueOf(first) + "/" + String.valueOf(second) + "=" + String.valueOf(first / second));
        }
    }
}
