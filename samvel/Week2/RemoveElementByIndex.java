package Week2;

import java.util.Scanner;

public class RemoveElementByIndex {

    public static int[] removeElementFromArray (int[] arr, int index) {
        int[] removedArray = new int[arr.length - 1];

        for (int i=0, j=0; i<arr.length; i++) {
            if (i == index) {
                continue;
            }
            removedArray[j++] = arr[i];
        }
        return removedArray;
    }

    public static void main (String[] args) {

        int[] randomArray = new int[10];
        for (int i=0; i<randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*100);
            System.out.print(randomArray[i] + " ");
        }

        System.out.println("Please insert the index of element you want to be deleted: ");

        Scanner input = new Scanner(System.in);
        int userIndex = input.nextInt();

        if (userIndex<0 && userIndex>9) {
            System.out.println("Please enter number in between 0 and 9");
        }

        System.out.println("your new array with removed element is: ");
        removeElementFromArray(randomArray, userIndex);



    }
}
