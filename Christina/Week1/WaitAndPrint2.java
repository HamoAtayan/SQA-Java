package Week1;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class WaitAndPrint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time you want to wait:");
        int timeToWait = sc.nextInt();
        long start = new Date().getTime();
        while (new Date().getTime() - start < timeToWait * 1000) {
        }
        System.out.println("Done!!!");
    }
}
