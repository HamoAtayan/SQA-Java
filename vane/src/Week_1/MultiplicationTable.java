package Week_1;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2019
 */
public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter number:");
        int n = s.nextInt();
        int i = 1;
        while (i < 10) {
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }
    }
}
