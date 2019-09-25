import java.util.Scanner;

public class FindNextPrimeNumber {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert an integer, and we will next closes prime number ");
        int userInput = input.nextInt();
        int prime = 0;
        if (userInput == 1 || userInput <= 0) {
            System.out.println("Please input number that is greater then 1 ");
        }
        for (int nextPrime = userInput; nextPrime<15; nextPrime++) {
            int count = 0;
            for (int counter = 2; counter <= nextPrime/2; ++counter) {
                if (nextPrime%counter == 0) {
                    count ++;
                }
            }
            if (count == 0) {
                prime = nextPrime;
                break;
            }
        }
        System.out.println("Next prime number will be: " + prime);
    }
}
