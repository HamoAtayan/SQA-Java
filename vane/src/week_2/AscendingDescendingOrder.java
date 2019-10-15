package week_2;

import java.util.Arrays;


/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class AscendingDescendingOrder {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int temp;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            System.out.println("arr[" + i + "] = {" + arr[i] + "}");
        }

        Arrays.sort(arr, 0, 10);

        System.out.println("Ascending order of arr[] : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("Descending order of arr[] : " + Arrays.toString(arr));
    }
}
