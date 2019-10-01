package sonaKh.homework_1;

import java.util.Scanner;

public class Gravity {

    private static void calculation(double m) {
        double f = m * 9.8 * 0.17;                 //F(Gravity) = m(weight) * g(acceleration of free-falling object)
        System.out.println(f);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight");

        double weight = scanner.nextDouble();
        calculation(weight);
    }
}


