package week3;

import java.util.Scanner;

public class hamarUt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq tive:");
        int x = input.nextInt();

        System.out.println("Faktoriale havasar e" + " " + "=" + " " + rekursFactor(x));


    }

    private static int rekursFactor(int x) {

        if (x < 0) {
            System.out.println("Mutqagravac tive petq e drakan lini");
            return x;
        }
        if (x == 1 || x == 0) {

            return 1;
        } else {

            return x * rekursFactor(x - 1);
        }


    }

}
