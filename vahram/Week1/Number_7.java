package Week1;

import java.util.Date;
import java.util.Scanner;

public class Number_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time you want to wait:");
        int timeToWait = scanner.nextInt();
        long start = new Date().getTime();
        while (new Date().getTime() - start < timeToWait * 1000) {
        }
        System.out.println("Done");
    }
}
