package Week2;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class RemoveFromArrayByIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array's range:");
        int arraySize = sc.nextInt();
        int[] generatedArray = createArray(arraySize);
        System.out.println("The generated array is: ");
        for (int arrayValues : generatedArray) {
            System.out.print("{" + arrayValues + "}");
        }
        System.out.println("Select an index to delete:");
        int indexToBeDeleted = sc.nextInt();
        printNewArrayWithoutSelectedIndex(generatedArray, indexToBeDeleted);

    }

    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static void printNewArrayWithoutSelectedIndex(int[] array, int indexToBeDeleted) {
        int[] newArrayWithoutSelectedIndex = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == indexToBeDeleted) {
                continue;
            }
            newArrayWithoutSelectedIndex[j++] = array[i];
        }

        System.out.println("The new array is: ");
        for (int newArrayValues : newArrayWithoutSelectedIndex) {
            System.out.println("{" + newArrayValues + "}");
        }
    }
}
