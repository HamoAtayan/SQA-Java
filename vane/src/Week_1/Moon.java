package Week_1;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Moon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight:");
        System.out.println("Your weight in the mood would be " + weightInMoon(sc.nextDouble()) + " KG");
    }

    public static double weightInMoon(double kg) {
        return kg * 0.17;
    }
}
