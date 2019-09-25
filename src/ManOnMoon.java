import java.util.Scanner;

public class ManOnMoon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert what is your weight on Earth: ");

        double userMass = input.nextDouble();

        double massOnMoonMultiplicator = 0.17;
        
        double massOnMoon = userMass*massOnMoonMultiplicator;
        
        System.out.println("Your mass on moon will be equal to: " + massOnMoon);
    }
}
