package week_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class IncreaseBy10Percent {
    public static void main(String[] args) {
        double[] arr = new double[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        increaseByIndex(arr, 4);
        System.out.println(arr[4]);
    }

    private static void increaseByIndex(double[] array, int index) {
        array[index] = array[index]+array[index]*0.1;
    }
}
