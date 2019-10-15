package Week2;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class InputIsBeingContainedInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array's range:");
        int arraySize = sc.nextInt();
        System.out.println("Enter the number to be checked:");
        int numberToCheck = sc.nextInt();
        int[] arrayToCheck = createArray(arraySize);
        for (int arrayValues : arrayToCheck) {
            System.out.println("{" + arrayValues + "}");
        }
        if (containsInArray(arrayToCheck, numberToCheck)) {
            System.out.println("The number that is being contained in the array is: " + numberToCheck);
        } else {
            System.out.println("There are no matches.");
        }
    }

    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static boolean containsInArray(int[] array, int numberToCheck) {
        boolean isContain = false;
        for (int valuesToCheck:array) {
            if (valuesToCheck == numberToCheck) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }
}
