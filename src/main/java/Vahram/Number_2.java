package Vahram;

import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
        }

    }
}
