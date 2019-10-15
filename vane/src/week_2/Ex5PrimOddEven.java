package week_2;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Ex5PrimOddEven {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] primeNumbers = new int[10];
        int[] oddNumbers = new int[10];
        int[] evenNumbers = new int[10];
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println("arr[" + i + "] = {" + arr[i] + "}");
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                evenNumbers[a] = arr[j];
                a++;
            } else {
                oddNumbers[a] = arr[j];
                a++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < 100; j++) {
                if (arr[i] % j == 0) {
                        isPrime = false;
                        break;

                }
            }

            if (isPrime) {
                primeNumbers[a] = arr[i];
                a++;
            }
        }

        System.out.println("even numbers are: ");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(" {" + evenNumbers[i] + "} ");
        }

        System.out.println();

        System.out.println("odd numbers are: ");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(" {" + oddNumbers[i] + "} ");
        }
        System.out.println();

        System.out.println("Prime numbers are: ");
        for (int i=0; i<primeNumbers.length; i++) {
            System.out.print(" {" +primeNumbers[i] + "} ");
        }
    }
}
