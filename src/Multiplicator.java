import java.util.Scanner;

// User should input a positive integer and receive multiplications up to x9
public class Multiplicator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int multiplicative;

        /* if (!input.hasNextInt()) {
            System.out.println("Please insert positive integer! "); //Check if entered value is int
        } else */
        //Why the block above does not work?

        if (userInput <= 0) {
            System.out.println("Please insert positive integer! "); //Check if entered value is positive number
        } else {
            for (int i = 1; i<10; ++i) {
                multiplicative = i*userInput;
                System.out.println(multiplicative);
            }
        }

    }
}
