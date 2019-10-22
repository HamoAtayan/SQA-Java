package Week3;

public class MijinTvabanakanOfArray {
    public static void main (String[] args){
        double[] arrayOfDoubles = new double[10];
        double sum = 0;
        for (int i=0; i<arrayOfDoubles.length; i++) {
            arrayOfDoubles[i] = Math.random()*10;
            System.out.println("arrayOfDoubles{" + i + "] = " + arrayOfDoubles[i]);
            sum += arrayOfDoubles[i];
        }
        System.out.println("Mijin Tvabanakany = " + sum/arrayOfDoubles.length);
    }
}
