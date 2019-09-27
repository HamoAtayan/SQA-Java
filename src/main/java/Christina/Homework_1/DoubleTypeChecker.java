package Christina.Homework_1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class DoubleTypeChecker {
    public static void main(String[] args) {
        boolean isDouble = false;
        while (!isDouble) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type a double-type number:");
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input\n");
            } else {
                isDouble = true;
                System.out.println("Input is double");
            }
        }
    }
}
