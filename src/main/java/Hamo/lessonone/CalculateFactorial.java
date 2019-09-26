package Hamo.lessonone;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class CalculateFactorial {
    public static void main(String[] args) {
        calculateFactorial(5);
    }

    public static void calculateFactorial(int i) {
        int d = 0;
        for (int j = 1; j <= i; j++) {
            d = j * i;
        }
        System.out.println(d);
    }
}
