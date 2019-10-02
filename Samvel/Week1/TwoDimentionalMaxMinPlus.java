import java.util.Scanner;

public class TwoDimentionalMaxMinPlus {
    public  static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input length of rows of array: ");
        int i = input.nextInt();
        System.out.println("Input length of columns of array: ");
        int j = input.nextInt();
        int [][] doubleArray = new int[i][j];


        for (int counter1 = 0; counter1 < i; counter1++) {
            for (int counter2 = 0; counter2 < j; counter2++) {
                System.out.println("doubleArray[ " + counter1 + " ][ " + counter2 + " ] = ");
                doubleArray[counter1][counter2] = input.nextInt();

            }
        }
        int max = doubleArray[0][0];
        int min = doubleArray[0][0];

        for (int counter1 = 0; counter1 < i; counter1++) {
            for (int counter2 = 0; counter2 < j; counter2++) {
                if (doubleArray[counter1][counter2] > max) {
                    max = doubleArray [counter1][counter2];
                }
                if (doubleArray[counter1][counter2] < min) {
                    min = doubleArray[counter1][counter2];
                }
            }
        }
        System.out.println("Max = " + max + " , Min = " + min);
    }
}
