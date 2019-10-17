package Week3;

public class findNOFFibonachiRecursion {
    //Fibonacci Series using Recursion

    public static int findFibN (int n) {
        if (n <= 1)
            return n;
        return (findFibN(n-1) + findFibN(n-2));
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(findFibN(n));

    }
}
