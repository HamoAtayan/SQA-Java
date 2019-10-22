package Week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class SortArrays {
    public static void main(String[] args) {
        int arraySize = makeInputUsingScanner();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("{" + array[i] + "}");
        }
        printSortedArrays(array, arraySize);
    }

    private static void printSortedArrays(int[] args, int arraySize) {

        //Sorting by ASC
        Arrays.sort(args, 0, arraySize);
        System.out.println("The array in ascending mode will be:");
        for (int values : args) {
            System.out.println("{" + values + "}");
        }

        //Sorting by DSC
        System.out.println("The array in descending mode will be:");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print("{" + args[i] + "}");
        }
    }

    private static int makeInputUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array's range:");
        int input = sc.nextInt();
        return input;
    }


}
