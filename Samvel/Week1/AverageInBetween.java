import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;

public class AverageInBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert two integers: ");
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int sum = 0;
        int max;
        max = (input1 < input2) ? input2:input1;
        int min;
        min = (input1 < input2) ? input1:input2;
        int difference = max - min;
        int average;
        for (int i = min; i<=max; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers between " + input1 + " and " + input2 + " is " + sum);
        average = sum / difference;
        System.out.println("The average of numbers in between is equal to: " + average);

    }
}
