package Week3;

import java.util.Scanner;

public class DoesContainInput {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i=0; i<randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*10);
            System.out.print(randomArray[i] + " ");
        }
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        for (int i=0; i<randomArray.length; i++) {
            if (randomArray[i] == userInput) {
                System.out.println("Your array contains your number: and that number is - " + userInput);
                break;
            }
            if (i == (randomArray.length - 1) && randomArray[i] != userInput) {
                System.out.print("There are no matches with your number! ");
            }
        }
    }
}
