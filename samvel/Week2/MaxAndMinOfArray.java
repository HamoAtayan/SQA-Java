package Week2;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        int[] randomArray = new int[10];

        for (int i=0; i<randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*100);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println("\n");
        int max = randomArray[0];
        int min = randomArray[0];
        for (int i=0; i<randomArray.length && i != (randomArray.length-1); i++) {
            if (randomArray[i]>max) {
                max = randomArray[i];
            }
            if (min > randomArray[i]) {
                min = randomArray[i];
            }
        }
        System.out.println("Maximum number of array is: " + max + " and minimum number of array is: " + min);
    }
}
