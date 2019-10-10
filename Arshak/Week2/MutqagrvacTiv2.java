package Week2;
import java.util.Scanner;
public class MutqagrvacTiv2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq tive:");
        double x = input.nextInt();

        int[] chorordmasiv = {55, 89, 6, 75, 15, 29, 78, 3, 65, 13};





        for (int i:chorordmasiv) {
            if (chorordmasiv[i] == x) {
                System.out.println("Mutqagrvac tive ka");
            }

            else {
                System.out.println("Mutqagrvac tive chka");
            }


        }
    }
}