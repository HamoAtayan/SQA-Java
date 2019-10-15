package Week2;

import java.util.Scanner;

public class MutqagrvacTiv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq tive:");
        int x = input.nextInt();

        int[] chorordMasiv = {55, 89, 6, 75, 15, 29, 78, 3, 65, 13};
        if (containsInArray(chorordMasiv, x)) {
            System.out.println("Tivy ka");
        } else {
            System.out.println("Tiy chka");
        }
    }

    public static boolean containsInArray(int[] array, int x) {
        boolean isContain = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }
}