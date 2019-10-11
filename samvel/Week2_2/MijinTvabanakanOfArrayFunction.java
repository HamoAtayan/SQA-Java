package Week2_2;

public class MijinTvabanakanOfArrayFunction {
    public static double calculateMijinTvabanakanOfArray (double[] arr) {
        double sum = 0;
        double mijinTvabanakan;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        mijinTvabanakan = sum/arr.length;
        System.out.print(mijinTvabanakan);
        return  mijinTvabanakan;
    }

    public static void main (String[] args) {
        double[] randmArray = new double[10];
        for (int i=0; i<randmArray.length; i++) {
            randmArray[i] = Math.random()*10;
        }
        calculateMijinTvabanakanOfArray(randmArray);
    }
}
