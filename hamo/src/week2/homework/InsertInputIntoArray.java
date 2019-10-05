package week2.homework;

import java.util.Scanner;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class InsertInputIntoArray {
    Scanner scanner = new Scanner(System.in);
    public static int arraySize;
    public static int test;

    public static void main(String[] args) {
        understandArraySize(7564);
        dxk();
    }

    public static void understandArraySize(int input) {
        input = test;
        while (input != 0) {
            input /= 10;
            ++arraySize;
        }

    }

    public static void dxk() {
        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize - 1; i++) {
            int temp = test % 10;
            array[arraySize - 1] = test % 10;
            --arraySize;
            System.out.println(temp);
        }
    }
}
