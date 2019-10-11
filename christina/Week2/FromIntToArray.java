package Week2;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class FromIntToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an int-type number:");
        int input = sc.nextInt();
        printInputInArrays(input);
    }

    public static void printInputInArrays(int input) {
        if (input == 0) {
            return;
        }
        int[] arrayFromInputs = new int[5];
        int size = 0;
        while (input > 0) {
            int remaining = input % 10;
            input /= 10;
            arrayFromInputs[size++] = remaining;
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print("{" + arrayFromInputs[i] + "}");
        }

    }


}

