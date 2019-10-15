package Week2;

public class MaxEvMin {
    public static void main(String[] args) {
        int[] chorordmasiv = {55, 89, 6, 75, 15, 29, 78, 3, 65, 13};

        int min = minimum(chorordmasiv);
        int max = maximum(chorordmasiv);


    }

    private static int minimum(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Minimum tive =" + min);


        return min;
    }

    private static int maximum(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Maximum tive =" + max);

        return max;


    }
}
