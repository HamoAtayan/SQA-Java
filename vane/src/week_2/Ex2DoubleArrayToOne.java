package week_2;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Ex2DoubleArrayToOne {
    public static void main(String[] args) {
        int[][] doubleArray = {{7, 65, 8} , {50 , 1, 4}};
        int[] singleArray = new int[6];
        int k = 0;


        for (int i=0; i<2; i++) {
            for (int j=0; j<3; j++) {
                singleArray[k] = doubleArray[i][j];
                System.out.print(" " +singleArray[k]+ " " );
                k++;
            }
        }

    }
}
