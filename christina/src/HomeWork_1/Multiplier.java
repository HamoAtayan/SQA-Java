package src.HomeWork_1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class Multiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        numberMultiplier(input.nextInt());
    }

    public static void numberMultiplier(int input) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(input + "*" + i + "=" + (input * i));
        }
    }
}
