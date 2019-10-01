package Lilia;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num1 = Num.nextDouble();
        System.out.println("Enter a number:");
        double num2 = Num.nextDouble();
        System.out.println("Enter an operator:");
        char operator = Num.next().charAt(0);
        double result;
        switch (operator) {
            case ('+'):
                result = num1 + num2;
                break;
            case ('-'):
                result = num1 - num2;
                break;
            case ('*'):
                result = num1 * num2;
                break;
            case ('/'):
                result = num1 / num2;
                break;
            default:
                System.out.println("incorrect operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + "=" + result);

    }


}


