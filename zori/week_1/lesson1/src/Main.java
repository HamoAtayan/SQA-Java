import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Zori Sargsyan on Sep, 2019
 */
public class Main {
    public static void main(String[] args) {
        sumOfPrimeNumber();

    }

    private static void checkIfInputtedNumberIsDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a double: ");
        if (scanner.hasNextDouble()) {
            System.out.println(String.format("'%s' is double", scanner.nextLine()));
        } else {
            System.out.println(String.format("'%s' is not double", scanner.nextLine()));
        }
    }

    private static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a natural number: ");
        boolean isInt = scanner.hasNextInt();
        int inputtedNumber = scanner.nextInt();
        boolean isPositive = (inputtedNumber > 0);
        if (isInt && isPositive) {
            for (int i = 1; i <= 9; ++i) {
                System.out.println(String.format("%s X %s = %s", inputtedNumber, i, (inputtedNumber * i)));
            }
        } else {
            System.out.println("The inputted value is not natural number.");
        }
    }

//    Did without checking
    private static void countWeightOnMoon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your weight: ");
        System.out.println(String.format("Your weight is %s on Moon", 17*scanner.nextDouble()/100));
    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double argument1 = scanner.nextDouble();
        System.out.print("Input the second number: ");
        double argument2 = scanner.nextDouble();
        System.out.print("Input one of this operators: + , -, *, /: ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println(String.format("%s + %s = %s", argument1, argument2, (argument1 + argument2)));
                break;
            case "-":
                System.out.println(String.format("%s - %s = %s", argument1, argument2, (argument1 - argument2)));
                break;
            case "*":
                System.out.println(String.format("%s * %s = %s", argument1, argument2, (argument1 * argument2)));
                break;
            case "/":
                if (argument2 == 0) {
                    System.out.println("Division on 0 is not allowed");
                } else {
                    System.out.println(String.format("%s / %s = %s", argument1, argument2, (argument1 / argument2)));
                }
                break;
            default:
                System.out.println("'%s' is wrong operator");
                calculator();
        }
    }

//    Done without checks. Assume the input value is correct
    private static void checkIfNumberIsPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a natural number: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrimitive(number);
        if (isPrime) {
            System.out.println(String.format("'%s' number is prime number", number));
        } else {
            System.out.println(String.format("'%s' number is not prime number", number));
        }
    }

//    this is helper method
    private static boolean isPrimitive(int number) {
        boolean isPrime = true;
        int cycleEnd = (int) Math.sqrt(number);
        for (int i = 2; i <= cycleEnd; ++i) {
            if ((number % i) == 0) {
                isPrime = false;
                break;
            }
        }
        return  isPrime;
    }

    private static void findCloserPrimitiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input != 0) {
            if (isPrimitive(input)) {
                System.out.println(String.format("'%s' number is the closer prime number", input));
                System.out.print("Input new number: ");
                input = scanner.nextInt();
            } else {
                input +=1;
            }
        }
    }

    private static void waitForInputtedTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds to wait: ");
        int input = scanner.nextInt();
        try {
            TimeUnit.SECONDS.sleep(input);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void countDistanceBetweenCities() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first city latitude: ");
        double latitude1 = scanner.nextDouble();
        System.out.print("Input the first city longitude: ");
        double longitude1 = scanner.nextDouble();
        System.out.print("Input the second city latitude: ");
        double latitude2 = scanner.nextDouble();
        System.out.print("Input the second city longitude: ");
        double longitude2 = scanner.nextDouble();

        System.out.print("The distance between 2 cities is ");
        double distance = Math.sqrt(Math.pow((latitude2 - latitude1), 2) + Math.pow((longitude2 - longitude1), 2));
        System.out.println(distance);
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input natural number: ");
        int input = scanner.nextInt();
        if (input < 0) {
            System.out.println("Wrong input");
        } else if(input == 0 || input == 1) {
            System.out.println("Factorial of 1 is 1");
        } else {
            int factorial = 1;
            for (int i = 1; i <= input; ++i) {
                factorial *= i;
            }
            System.out.println("Factorial of " + input + " is " + factorial);
        }
    }

    private static void countSumBetweenTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int number2 = scanner.nextInt();
        if (number1 > number2){
            number1 += number2;
            number2 = number1 - number2;
            number1 -= number2;
        }
        int sum = 0;
        for (int i = number1; i <= number2; ++i) {
            sum += i;
        }
        System.out.println("Summary of numbers between " + number1 + " and " + number2 + " is " + sum);
        System.out.println("Avarage is " + sum/(number2-number1));
    }

    public static void sumOfPrimeNumber() {
        int sum = 0;
        for (int i = 2; i < 100; i++) {
            if (isPrimitive(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
