package Week1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WaitXSeconds {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int seconds;
        System.out.println("Please enter after how many seconds you want the program to start? ");
        seconds = input.nextInt();
        TimeUnit.SECONDS.sleep(seconds);
        System.out.println("Successfully waited " + seconds + " seconds before printing this :)");
        input.close();
    }
}
