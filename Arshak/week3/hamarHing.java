package week3;

import java.util.Arrays;

public class hamarHing {


    public static void main(String[] args) {

        int[] arajin = {34, 5, 87, 23, 90, 54, 7};
        int[] erkrord = {7, 89, 43, 2, 18, 9, 47};
        int[]normasiv = errord(arajin,erkrord);
        System.out.println("Nor masivn e => " + Arrays.toString(normasiv));
        mijin(normasiv);
    }


    private static int[] errord(int[] a, int[] b) {


        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;

    }

    public static void mijin(int[] array) {
        int mijin = 0;
        for (int i = 0; i < array.length; i++) {
            mijin = mijin + array[i];
        }
        System.out.println("Mijin tvabanakann e => " + mijin/array.length);
    }
}
