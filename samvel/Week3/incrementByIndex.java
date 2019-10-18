package Week3;

public class incrementByIndex {
    public static void incrementByIndex (double[] arr, int index) {
        arr[index] = arr[index] * 1.1;
    }

    public static void main (String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*10;
            System.out.println(array[i] + " ");
        }

        incrementByIndex(array, 5);

        for (double v : array) {
            System.out.println(v + " ");
        }
    }
}
