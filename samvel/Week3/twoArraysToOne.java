package Week3;

//Create one array out of give two arrays

public class twoArraysToOne {
    public static int[] combineIntoOneArray (int arr1[], int arr2[]) {

        int totalLength = arr1.length + arr2.length;
        int [] combinedArray = new int[totalLength];

        System.arraycopy(arr1, 0, combinedArray, 0, arr1.length);
        for (int i = arr1.length, j = 0; j < arr2.length; j++, i++) {
            combinedArray[i] = arr2[j];
        }

        return combinedArray;
    }

    //Calculate average sum of two arrays

    public static double averageOfArrays (int[] arr1, int[] arr2) {
        int[] arr3 = combineIntoOneArray(arr1, arr2);
        double sum = 0;
        for (int value : arr3) {
            sum += value;
        }
        sum = sum / arr3.length;

        return sum;
    }

    public static void main (String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[8];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*10);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random()*10);
        }

        int[] combinedArray = combineIntoOneArray(array1, array2);
        double averageSum = averageOfArrays(array1, array2);

        for (int value : combinedArray) {
            System.out.println(value);
        }
        System.out.println("average sum is: " + averageSum);
    }
}
