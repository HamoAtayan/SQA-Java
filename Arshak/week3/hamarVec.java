package week3;
import java.util.Arrays;
import java.util.Scanner;

public class hamarVec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq tive:");
        int i = input.nextInt();
        int[] chorordMasiv = {55, 89, 6, 75, 15, 29, 78, 3, 65, 13};
        tasTokos(chorordMasiv,i);
    }

    public static void tasTokos(int[] array, int x) {

        int tokos = array[x]*10/100;
        System.out.println("Tas tokose kazmum e " + " " + tokos);

            }

        }





