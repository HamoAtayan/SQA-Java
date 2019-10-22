package Week_1;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2019
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }

}

