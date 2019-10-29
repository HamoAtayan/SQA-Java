package homework_2;

import java.util.Scanner;

public class EighthExercise {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int max = 0;
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i] = scanner.nextInt();
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("The max entered numbers is:" + max);
        System.out.println("The min entered numbers is:" + min);
    }
}
