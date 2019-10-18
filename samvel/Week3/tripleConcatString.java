package Week3;

public class tripleConcatString {
    public static String[] concatArray (String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].concat(arr[i]).concat(arr[i]);
        }
        return arr;
    }

    public static void main (String[] args) {
        String[] array = {"24", "Sa", "BJ"};
        concatArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
