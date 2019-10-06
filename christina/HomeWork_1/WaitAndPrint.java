package HomeWork_1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */

public class WaitAndPrint {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time you want to wait:");
        int timeToWait = sc.nextInt();
        timeWaiter(timeToWait);
    }

    public static void timeWaiter(int timeToWait) throws InterruptedException {
        TimeUnit.SECONDS.sleep(timeToWait);
        System.out.println("Done!");
    }
}

