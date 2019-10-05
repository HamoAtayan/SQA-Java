package src.HomeWork_1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class WeightOnTheMoon {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        weightCounterOnTheMoon(weight.nextDouble());
    }

    public static void weightCounterOnTheMoon(double m) {
        System.out.println("Your weight on the Moon is " + String.valueOf(m * 0.17));
    }
}
