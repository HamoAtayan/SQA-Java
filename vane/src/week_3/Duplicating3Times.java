package week_3;

import java.util.Arrays;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Duplicating3Times {
    public static void main(String[] args) {
        String[] strings = {"a", "12", "3times", "hello "};

        getValue3Times(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void getValue3Times(String [] array) {
        for (int i=0; i<array.length; i++) {
            array[i] = array[i]+array[i]+array[i];
        }
    }
}
