package src.Week_2;

import java.util.HashSet;
import java.util.Set;

public class EX9_CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {7, 8, 6, 5, 2, 21, 3};
        int[] arr2 = {10, 5, 9, 20, 7, 8, 21, 2};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}

