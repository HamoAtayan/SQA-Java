package src.Week_1;

import java.util.Scanner;

public class SumBetweenTwoNumbersAndAverage {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int sum = 0;
        int avg;
        System.out.println("Enter the first number:");
        int firstnum = num.nextInt();
        System.out.println("Enter the second number:");
        int secondnum = num.nextInt();
        int max = Math.max(firstnum, secondnum);
        int min = Math.min(firstnum, secondnum);
        int difference = (max - min) + 1;
        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        avg = sum / difference;
        System.out.println("The sum of numbers between is :" + sum);
        System.out.println("The average is:"+avg);
    }
}
