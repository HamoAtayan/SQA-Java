package Week3;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class CombineRepeatedValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array's range:");
        int firstArraySize = sc.nextInt();
        System.out.println("Enter the second array's range:");
        int secondArraySize = sc.nextInt();
        int[] firstArray = createArray(firstArraySize);
        int[] secondArray = createArray(secondArraySize);
        System.out.println("First array is:");
        for (int firstArrayValues : firstArray) {
            System.out.println("{" + firstArrayValues + "}");
        }
        System.out.println("Second array is:");
        for (int secondArrayValues : secondArray) {
            System.out.println("{" + secondArrayValues + "}");
        }
        printTheCombinedArray(firstArray, secondArray);
    }

    private static void printTheCombinedArray(int[] firstArray, int[] secondArray) {
        int repeatsCount = 0;
        for (int firstArrayValues : firstArray) {
            for (int secondArrayValues : secondArray) {
                if (firstArrayValues == secondArrayValues) {
                    repeatsCount += 1;
                }
            }
        }
        int[] combinedArray = new int[repeatsCount];
        int index = 0;

        for (int firstArrayValues : firstArray) {
            for (int secondArrayValues : secondArray) {
                if (firstArrayValues == secondArrayValues) {
                    combinedArray[index] = firstArrayValues;
                    index++;
                }

            }
        }
        System.out.println("The new array of combined values is: ");
        for (int combinedArrayValues : combinedArray) {
            System.out.print("{" + combinedArrayValues + "}");
        }
    }


    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
