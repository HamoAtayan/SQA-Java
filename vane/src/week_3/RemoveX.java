package week_3;

import java.util.Arrays;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class RemoveX {
    public static void main(String[] args) {
        String arr[] = {"12x5", "xyz", "xxxxxx", "this is x"};
        removeX(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void removeX(String[] array) {
        for (int i=0; i<array.length; i++){
            array[i] = array[i].replaceAll("x", "");
        }
    }
}
