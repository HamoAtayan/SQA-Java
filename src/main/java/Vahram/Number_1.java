package Vahram;

import java.util.Scanner;

public class Number_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            printNumber(scanner.nextInt());
        } else if (scanner.hasNextDouble()) {
            printNumber(scanner.nextDouble());
        } else {
            System.out.println("NOT DOUBLE");
        }
    }

    static void printNumber(int numb) {
        System.out.println("Integer: NOT DOUBLE " + numb);
    }

    static void printNumber(double numb) {
        System.out.println("Double: " + numb);
    }
}

