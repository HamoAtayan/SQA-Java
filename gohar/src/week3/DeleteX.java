package week3;

import java.util.Scanner;

public class DeleteX {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] array = {"axa", "xbb", "ccx"};
        String[] array2 = new String[array.length];
        for (int i = 0; i < array.length; ++i) {
            String cur = array[i];
            array2[i] = cur.replace("x", "");
            System.out.println(array2[i]);
        }
    }
}
