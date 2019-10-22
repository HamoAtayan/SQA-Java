package week_2;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class AverageOfArray {
    public static void main(String[] args) {
        double d[] = new double[10];
        for (int i = 0; i < d.length; i++) {
            d[i] = Math.random();
            System.out.println("d[" + i + "] = {" + d[i] + "}" );
        }
        double sum = 0;
        for (int j = 0; j < d.length; j++) {
            sum = sum + d[j];
        }
        System.out.println("Average is " + sum / d.length);
    }
}