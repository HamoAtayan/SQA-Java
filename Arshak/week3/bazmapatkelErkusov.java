package week3;

import java.util.ArrayList;
import java.util.Arrays;

public class bazmapatkelErkusov  {

    public static void main(String[] args) {

        int[] array = {4, 55, 78, 24, 58, 134, 8};
        toDouble(array);
        System.out.println(Arrays.toString(array));

    }

    public static void toDouble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *=  2;
        }
    }
}
