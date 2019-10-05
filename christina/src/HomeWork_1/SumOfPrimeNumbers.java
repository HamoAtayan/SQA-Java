package src.HomeWork_1;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                sum += i;
            }
        }
        System.out.println(sum-1);
    }
}


