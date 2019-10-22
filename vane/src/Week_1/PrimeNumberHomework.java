package Week_1;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2019
 */
public class PrimeNumberHomework {
    public static void main(String[] args) {
        int i, m;
        boolean isPrime = true;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("not prime");
        } else {
            for (i = 2; i < m; i++) {
                if (n % i == 0) {
                    System.out.println("not prime");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("prime");
            }
        }
    }
}


