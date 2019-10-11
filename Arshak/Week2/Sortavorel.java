package Week2;

import java.util.Arrays;

public class Sortavorel {


    public static void main(String[] args) {
        int[] chorordmasiv = {55, 89, 6, 75, 15, 29, 78, 3, 65, 13};
        Arrays.sort(chorordmasiv, 0, 10);
        for (int index=chorordmasiv.length-1;index>=0;index--){
            System.out.print(chorordmasiv[index]+" ");
        }

    }
}