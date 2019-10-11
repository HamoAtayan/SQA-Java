package Week2;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class AverageOfDoubleArray {
    public static void main(String[] args) {
        averageCounter();
    }
    public static void averageCounter() {
        double sum = 0;
        double[] arrayOfDoubles = new double[10];
        for (int i = 0; i < 10; i++) {
            arrayOfDoubles[i] = Math.random();
        }
        for (double value : arrayOfDoubles) {
            sum += value;
        }
        System.out.println("The sum of double numbers is "+ sum);
        System.out.println("The result is " + (sum / arrayOfDoubles.length));
    }
}
