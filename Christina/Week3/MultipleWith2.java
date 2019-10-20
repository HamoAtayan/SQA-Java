package Week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class MultipleWith2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array's range:");
        int arraySize = sc.nextInt();
        int[] array = createArray(arraySize);
        System.out.println("The generated array is: ");
        System.out.println(Arrays.toString(array));
        System.out.println("The multiplied array is: ");
        System.out.print(Arrays.toString(multipleWithNumber(array)));
    }

    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    private static int[] multipleWithNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }
}
