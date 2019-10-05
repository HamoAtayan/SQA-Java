package Week2;

public class SortArray {
    public static void main(String[] args) {

        int temp;
        int[] singleArray = new int[10];

        //Create our array and fill with random int numbers 1-9
        for (int i=0; i<singleArray.length; i++) {
            singleArray[i] = (int)(Math.random()*10);
            System.out.print((singleArray[i]));
        }

        //Sort by increasing order
        for (int i=0; i<singleArray.length; i++) {
            for (int j=i+1; j<singleArray.length; j++) {
                if (singleArray[i]>singleArray[j]) {
                    temp = singleArray[i];
                    singleArray[i] = singleArray[j];
                    singleArray[j] = temp;
                }
            }
        }

        for (int i=0; i<singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }

        //SOrt by decreasing order
        for (int i=0; i<singleArray.length; i++) {
            for (int j=i+1; j<singleArray.length; j++) {
                if (singleArray[i]<singleArray[j]) {
                    temp = singleArray[j];
                    singleArray[j] = singleArray [i];
                    singleArray[i] = temp;
                }
            }
        }

        for (int i=0; i<singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }
    }
}
