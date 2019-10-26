package week_3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Doubling {
    public static void main(String[] args) {
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        doublingNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static int[] doublingNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
