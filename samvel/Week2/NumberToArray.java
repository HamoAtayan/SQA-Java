package Week3;

import java.util.Scanner;

public class NumberToArray {
    public static void main(String[] args) {
        int arraySize = 0;
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()) {
            System.out.println("Please input positive integer!");
        }
        int userNumber = input.nextInt();
        int userNumberClone = userNumber;
        int mnacord = 0;
        while (userNumberClone != 0) {
            userNumberClone /= 10;
            arraySize++;
        }
        int [] ourNewArray = new int[arraySize];
        for (int i = arraySize-1; i>=0; i-- ) {
            mnacord = userNumber%10;
            userNumber = userNumber/10;
            ourNewArray[i] = mnacord;
        }
        System.out.print("New array is: ");
        for (int i=0; i<ourNewArray.length; i++) {
            System.out.print("{" + ourNewArray[i] + "} ");
        }
    }
}
