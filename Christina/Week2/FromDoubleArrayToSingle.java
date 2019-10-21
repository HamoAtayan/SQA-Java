package Week3;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class FromDoubleArrayToSingle {
    public static void main(String[] args) {
        int[][] doubleArray = {{10, 15}, {21, 29}, {39, 46}, {48, 39}, {75, 12}};
        printSingleArray(doubleArray);
    }

    private static void printSingleArray(int[][] doubleArray) {
        int z = 0;
        int[] newSingleArray = new int[10];

        System.out.println("The single array is");
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < 2; j++) {
                newSingleArray[z] = doubleArray[i][j];
                System.out.print("{" + newSingleArray[z] + "}");
                z++;
            }
        }
    }
}
