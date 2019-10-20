package week3;

import java.util.Arrays;


public class jnjelXe {


    public static void main(String[] args) {

        String[] arajin = {"Erevanx", "Exrebuxni", "Armenia", "Van", "xxx", "Hayastan"};
        String[] erkrord = new String[arajin.length];
        arancX(arajin, erkrord);
    }


    public static void arancX(String[] array, String[] mihatelarray) {
        for (int i = 0; i < array.length; i++) {
            mihatelarray[i] = array[i].replace("x", "");


        }
        System.out.println(Arrays.toString(mihatelarray));


    }
}
