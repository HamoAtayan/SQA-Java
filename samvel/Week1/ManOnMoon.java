package Week1;

import java.util.Scanner;

public class ManOnMoon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert what is your weight on Earth: ");

        float userMass = input.nextFloat();

        float massOnMoonMultiplicator = 0.17f;
        
        float massOnMoon = userMass*massOnMoonMultiplicator;
        
        System.out.println("Your mass on moon will be equal to: " + massOnMoon);
    }
}
