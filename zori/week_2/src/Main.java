/**
 * Created by Zori Sargsyan on Oct, 2019
 */

public class Main {
    public static void main(String[] args) {

//        exercise 1
//        double[] matrix = createMatrixWithRandomValues(10);
//        System.out.println("Matrix avarage = " + matrixAverage(matrix));

//        exercise 2
        checkTheFirstAndSecondPlaces();

//        exercise 3
        splitDigits(5834);

//        exercise 4
//        int[][] matrix = {{2, 5}, {1, 2, 3, 4}, {7, 8, 9}};
//        convertMatrixToVector(matrix);
//
//        exercise 5
//        int[] matrix = createMatrixWithRandomValues(20, 150, 1);
//        int[][] sortedMatrix = sortEvenOddPrimeNumbers(matrix);
//        for (int i = 0; i < sortedMatrix.length; ++i) {
//            for (int j = 0; j < sortedMatrix[i].length; ++j) {
//                System.out.print(sortedMatrix[i][j]+ " ");
//            }
//            System.out.println("");
//        }

//        exercise 6
//        int[] descOrder = sortAscendance(10);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(descOrder[i]);
//        }

//        exercise 7
//        int[] matrix = createMatrixWithRandomValues(10, 0, 100);
//        System.out.println(checkNumberInMatrix(25, matrix));

//        exercise 8
//        printMaxAndMin(20);

//        exercise 9
//        int[] matrix1 = new int[]{1, 2, 3, 4, 2, 6, 7, 8, 9, 10};
//        int[] matrix2 = new int[] {5, 10, 10, 2, 1, 11};
//        int[] repetitive = filterRepetitiveElements(matrix1, matrix2);
//        for (int i = 0; i < repetitive.length; i++) {
//            System.out.print(repetitive[i] + " ");
//        }

//        exercise 10
//        int[] matrix = deleteElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.print(matrix[i] + " ");
//        }
    }

//    this is helper method
    public static double[] createMatrixWithRandomValues(int size) {
        double[] matrix = new double[size];
        for (int i =0; i < size; ++i) {
            matrix[i] = Math.random() * 100;
        }
        return matrix;
    }

//  this is helper method
    public static int[] createMatrixWithRandomValues(int size, int max, int min) {
        int[] matrix = new int[size];
        for (int i =0; i < size; ++i) {
            matrix[i] = (int) (Math.random() * (max - min) + min);
        }
        return matrix;
    }

//    exercise 1
    public static double matrixAverage(double[] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; ++i) {
            sum += matrix[i];
        }
        return sum / matrix.length;
    }

//    exercise 2
    public static void checkTheFirstAndSecondPlaces() {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265 };
        for (int i = 0; i < 2; ++i) {
            int index = i;
            for (int j = i+1; j < times.length; ++j) {
                if (times[index] > times[j]) {
                    index = j;
                }
            }
            int tempTime = times[i];
            times[i] = times[index];
            times[index] = tempTime;
            String tempName = names[i];
            names[i] = names[index];
            names[index] = tempName;
        }

        System.out.println("The first position is "+ names[0]);
        System.out.println("The Second position is "+ names[1]);
    }

//    exercise 3
    public static int[] splitDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = 0; i < count; ++i) {
            digits[i] =  (number / (int)(Math.pow(10, (count-1-i))));
            number = number % (int)(Math.pow(10, (count-1-i)));
        }
        return digits;
    }

//    this is helper method
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count += 1;
            number = number / 10;
        }
        return count;
    }

//  exercise 4
    public static int[] convertMatrixToVector(int[][] matrix) {
        int vectorLength = 0;
        for (int i = 0; i < matrix.length; ++i){
            vectorLength += matrix[i].length;
        }
        int[] vector = new int[vectorLength];
        int currentIndex = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                vector[currentIndex] = matrix[i][j];
                currentIndex++;
            }
        }
        return vector;
    }

//    exercise 5
//    returns 2-dimensional matrix, which the first element is odd numbers list, the second one is even numbers list
//    and the third one is prime numbers list
    public static int[][] sortEvenOddPrimeNumbers(int[] matrix) {
        int[] numbersTypes = new int[matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i] % 2 == 0) {
                numbersTypes[i] = 1; // if number is even we keep 1 in numbersType array
                if (matrix[i] == 2){
                    numbersTypes[i] += 3; // if number is prime we add 3 to numbersType
                }
            } else {
                numbersTypes[i] = 2; // if number is odd we add 2 to numbersType
                if (isPrime(matrix[i])) {
                    numbersTypes[i] += 3;
                }
            }
        }
        int oddMassiveLength = 0;
        int evenMassiveLength = 0;
        int primeMassiveLength = 0;
        for (int i = 0; i < numbersTypes.length; ++i) {
            switch (numbersTypes[i]) {
                case 1: // when number is even
                    evenMassiveLength += 1;
                    break;
                case 2: //when number is odd and is not prime (e.g. 9)
                    oddMassiveLength += 1;
                    break;
                case 4: // when number is even and is prime in case 2
                    evenMassiveLength += 1;
                    primeMassiveLength += 1;
                    break;
                case 5: // when number is odd and prime (e.g. 7)
                    oddMassiveLength += 1;
                    primeMassiveLength += 1;
            }
        }
        System.out.println("evenMassiveLength = " + evenMassiveLength);
        System.out.println("oddMassiveLength = " + oddMassiveLength);
        System.out.println("primeMassiveLength = " + primeMassiveLength);
        int[] evenNumbers = new int[evenMassiveLength];
        int[] oddNumbers = new int[oddMassiveLength];
        int[] primeNumbers = new int[primeMassiveLength];
        int oddIndex = 0;
        int evenIndex = 0;
        int primeIndex = 0;
        for (int i = 0; i < numbersTypes.length; ++i) {
            switch (numbersTypes[i]) {
                case 1:
                    evenNumbers[evenIndex] = matrix[i];
                    ++evenIndex;
                    break;
                case 2:
                    oddNumbers[oddIndex] = matrix[i];
                    ++oddIndex;
                    break;
                case 4:
                    evenNumbers[evenIndex] = matrix[i];
                    ++evenIndex;
                    primeNumbers[primeIndex] = matrix[i];
                    ++primeIndex;
                    break;
                case 5:
                    oddNumbers[oddIndex] = matrix[i];
                    ++oddIndex;
                    primeNumbers[primeIndex] = matrix[i];
                    ++primeIndex;
            }
        }
        int[][] sortedMatrix = {oddNumbers, evenNumbers, primeNumbers};
        return sortedMatrix;
    }

//    Helper method
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //  exercise 6
    public static int[] sortDescending(int size) {
        int[] matrix = createMatrixWithRandomValues(10, 0, 100);
        for (int i =0; i < size-1; ++i) {
            int maxIndex = i;
            for (int j = i + 1; j < size; ++j) {
                if (matrix[maxIndex] < matrix[j]) {
                    maxIndex = j;
                }
            }
            int temp = matrix[i];
            matrix[i] = matrix[maxIndex];
            matrix[maxIndex] = temp;
        }
        return matrix;
    }

    //  exercise 6
    public static int[] sortAscendance(int size) {
        int[] matrix = createMatrixWithRandomValues(10, 0, 100);
        for (int i =0; i < size-1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < size; ++j) {
                if (matrix[minIndex] > matrix[j]) {
                    minIndex = j;
                }
            }
            int temp = matrix[i];
            matrix[i] = matrix[minIndex];
            matrix[minIndex] = temp;
        }
        return matrix;
    }

    //  exercise 7
    public static boolean checkNumberInMatrix(int number, int[] matrix) {
        boolean contains = false;
        for (int i = 0; i < matrix.length; ++i) {
            if (number == matrix[i]) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    //  exercise 8
    public static void printMaxAndMin(int massiveLength) {
        int[] massive = createMatrixWithRandomValues(massiveLength, 0, 100);
        int min = massive[0];
        int max = massive[0];
        for (int i = 0; i < massiveLength; ++i) {
            System.out.print(massive[i] + " ");
            if (massive[i] < min) {
                min = massive[i];
            } else if (massive[i] > max) {
                max = massive[i];
            }
        }
        System.out.println("\nmax = "+ max);
        System.out.println("min = "+ min);
    }

    //  exercise 9
    public static int[] filterRepetitiveElements(int[] matrixOne, int[] matrixTwo) {
        int[] repetitiveElements = new int[matrixOne.length];
        int index = 0;
        for (int i = 0; i < matrixOne.length; ++i) {
            for (int j = 0; j < matrixTwo.length; ++j) {
                if (matrixOne[i] == matrixTwo[j]) {
                    repetitiveElements[index] = matrixTwo[j];
                    index++;
                    matrixTwo = deleteElement(matrixTwo, j);
                    break;
                }
            }
        }
        while (repetitiveElements.length > index){
            repetitiveElements = deleteElement(repetitiveElements, repetitiveElements.length-1);
        }
        return repetitiveElements;
    }

    //  exercise 10
    public static int[] deleteElement(int[] matrix, int index) {
        if (index < matrix.length) {
            int[] newMatrix = new int[matrix.length-1];
            for (int i = 0; i < index; ++i) {
                newMatrix[i] = matrix[i];
            }
            for (int i = index+1; i < matrix.length; ++i) {
                newMatrix[i-1] = matrix[i];
            }
            return newMatrix;
        } else {
            throw new Error("The index is greater than matrix length");
        }
    }
}
