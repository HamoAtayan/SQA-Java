package Week2;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class SortByTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array's range:");
        int arraySize = sc.nextInt();
        int[] differentTypes = new int[arraySize];
        for (int i = 0; i < differentTypes.length; i++) {
            differentTypes[i] = (int) (Math.random() * 100);
            System.out.println("{" + differentTypes[i] + "}");
        }
        printArraySorter(differentTypes, arraySize);
    }


    private static void printArraySorter(int[] array, int arraySize) {
        int evenIndex = 0;
        int oddIndex = 0;
        int primeIndex = 0;
        int[] evenArray = new int[arraySize];
        int[] oddArray = new int[arraySize];
        int[] primeArray = new int[arraySize];
        boolean isPrime = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < Math.sqrt(array[i]); j++) {
                if (array[i] % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                primeArray[primeIndex] = array[i];
                primeIndex++;
            }

            if (array[i] % 2 == 0) {
                evenArray[evenIndex] = array[i];
                evenIndex++;
            } else if (array[i] % 2 != 0) {
                oddArray[oddIndex] = array[i];
                oddIndex++;
            }
        }
        System.out.println("The prime array is: ");
        for (int i = 0; i < primeArray.length; i++) {
            System.out.println("{" + primeArray[i] + "}");
        }
        System.out.println("The even array is: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.println("{" + evenArray[i] + "}");
        }
        System.out.println("The odd array is: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.println("{" + oddArray[i] + "}");
        }
    }

//    public static boolean isPrime(int[] args) {
//        boolean isPrime = false;
//        for (int i = 0; i < args.length; i++) {
//            for (int j = 2; j < Math.sqrt(args[i]); j++) {
//                if (args[i] % j == 0) {
//                    isPrime = true;
//                    break;
//                }
//            }
//        }
//        return isPrime;
//    }

}

