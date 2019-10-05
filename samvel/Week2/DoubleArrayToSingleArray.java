package Week2;

public class DoubleArrayToSingleArray {
    public static void main(String[] args) {
        int[][] doubleArray = {{22, 13} , {11 , 87} , {21 , 43}};
        int[] singleArray = new int[6];
        int k = 0;

        // System.out.println(doubleArray.length);
        System.out.print("New array consists of following elements: ");

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                singleArray[k] = doubleArray[i][j];
                System.out.print(" {" + singleArray[k] + "} ");
                k++;
            }
        }

    }
}
