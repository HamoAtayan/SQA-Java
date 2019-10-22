package Week3;

public class oneToNFactorialRecursion {

    public static int multiplyNumbers (int num) {
        if (num != 0 && (num-1 != 0)) {
            return num * multiplyNumbers(num - 1);
        }
        else
        {
            return num;
        }
    }

    public static void main (String[] args) {
        int number = 9;
        int mul = multiplyNumbers(number);
        System.out.println("Mul = " + mul);
    }
}

