package Week3;

public class doublingValueOfString {
    public static int[] doubleTheValue (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] array = {2, 4, 6, 8, 44};
        doubleTheValue(array);

        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
}
