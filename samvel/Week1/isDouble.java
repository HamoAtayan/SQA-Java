package Week1;

import java.util.Scanner;

public class isDouble {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); //Read input from user keyboard
        if (!input.hasNextDouble()) {
            System.out.println("Entered value type is not Double!");
        } else if (input.hasNextInt()) {
            System.out.println("Entered value type is not Double!");
        } else
        System.out.println("Entered value type is Double!");
    }
}
