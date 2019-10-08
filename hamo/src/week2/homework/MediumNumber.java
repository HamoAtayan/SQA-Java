package week2.homework;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class MediumNumber {
    double sum = 0;
    public static void main(String[] args) {

    }
    public double mediumSum(double [] arr){
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}