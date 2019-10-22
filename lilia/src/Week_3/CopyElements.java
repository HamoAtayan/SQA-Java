package src.Week_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        String first[] = {"a", "bb", "cc"};
        String copy[] = new String[first.length];
        copy = Arrays.copyOf(first, first.length);
        for (int i = 0; i < first.length; ++i) {
            System.out.print(String.format("[%s]", copy[i] + copy[i] + copy[i]));
        }
    }
}
