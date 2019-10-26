package Week3;

import java.util.Scanner;

public class OneFromTwo {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int repeaterCount = 0;

        System.out.println("Please insert the length of array 1: ");
        int array1Length = input.nextInt();
        int[] array1 = new int[array1Length];
        System.out.println("Please input your numbers for array 1");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }

        System.out.println("Please insert the length of array 2: ");
        int array2Length = input.nextInt();
        int[] array2 = new int[array2Length];
        System.out.println("Please input your numbers for array 2");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        for (int i=0; i<array1.length; i++) {
            for (int j=0; j<array2.length; j++) {
                if (array1[i] == array2[j]){
                    repeaterCount += 1;
                }
            }
        }

        int[] array3 = new int[repeaterCount];
        int y = 0;

        for (int i=0; i<array1.length; i++) {
            for (int j=0; j<array2.length; j++) {
                if (array1[i] == array2[j]){
                    array3[y] = array1[i];
                    y++;
                }
            }
        }

        System.out.print("New array that has repeating numbers is: ");
        for (int i=0; i<array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
