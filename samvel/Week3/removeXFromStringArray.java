package Week3;

public class removeXFromStringArray {
    public static String [] removeX (String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("x", "");
        }
        return arr;
    }

    public static void main (String[] args) {
        String[] array = {"x-Factor", "Triplexxx aut", "Here is x and then here is ax"};
        removeX(array);

        for (int i = 0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
