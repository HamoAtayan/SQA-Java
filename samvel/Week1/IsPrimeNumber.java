package Week1;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
//ask user to inser number. Here we store statusFlag variable to hold it as 0/1 in case if number is prime or not
        System.out.println("Please insert an integer, and we will check if it's a prime number or not: ");
        int userInput = input.nextInt();
        int statusFlag= 0;
// Check for negative numbers, 1 and 0 - these cannot be prime numbers
        if (userInput == 1 || userInput <= 0) {
            System.out.println("Number you have entered is not a prime number ");
        } else {
            //loop through values by dividing input from user. It should go up to max userInput/2 as there is no sense for more division
            for (int counter = 2; counter <= userInput/2; ++counter) {
                if (userInput%counter == 0) {
                    //if during dividing process there is residue left, then it is not a prime number
                    System.out.println("Number you have entered is not a prime number ");
                    //update flag status to 1 means that number is not prime
                    statusFlag = 1;
                    break;
                    // no point in continuing loop
                }
            }
            if (statusFlag == 0) {
                System.out.println("Number you have entered is a prime number ");
            }
        }
    }
}
