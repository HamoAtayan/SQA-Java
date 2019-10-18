package week3;

import java.util.Arrays;

public class hamarErku {

    public static void main(String[] args) {

        String[] arajin = {"Erevan", "Erebuni", "Armenia", "Van", "Hayastan"};
        erkrord(arajin);
        System.out.println(Arrays.toString(arajin));
    }

    public static void erkrord(String[] array) {
        for (int i = 0; i < array.length; i++) {
             array[i] = array[i]+array[i]+array[i];

        }
    }
}