package Hamo.lessonone;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class ParzTiv {
    public static void main(String[] args) {
       giveNextPrime(8);
    }

    public static boolean isParz(int a) {
        boolean isNumberPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isNumberPrime = false;
            }
        }
        return isNumberPrime;
    }

  static  void giveNextPrime(int n) {
        while (!isParz(n)) {
            n++;
        }
        System.out.println(n);

    }
}
