package Week3;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class MaxAndMinValuesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array's range:");
        int arraySize = sc.nextInt();
        int[] array = createArray(arraySize);
        for (int arrayValues : array) {
            System.out.println("{" + arrayValues + "}");
        }
        System.out.println("The minimum value of the array is: " + minimumValueOfArray(array));
        System.out.println("The maximum value of the array is: " + maximumValueOfArray(array));

    }

    private static int minimumValueOfArray(int[] array) {
        int minValue = array[0];
        for (int arrayValues: array) {
            if (minValue > arrayValues) {
                minValue = arrayValues;

            }
        }
        return minValue;
    }

    private static int maximumValueOfArray(int[] array) {
        int maxValue = array[0];
        for (int arrayValue: array) {
            if (maxValue < arrayValue) {
                maxValue = arrayValue;

            }
        }
        return maxValue;
    }


    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

}
