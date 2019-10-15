package Week2;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        String[] array = {"aa", ". ", "21"};
        arrayX3(array);
    }

    public static void arrayX3(String[] array) {
        for (String i : array) {
            System.out.print(i+i+i);
        }
    }
}
