package week3;
import java.util.Arrays;
import java.util.Scanner;

public class hamar4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq tive:");
        int z = input.nextInt();
        String[] arajin = {"Erevan", "Ani","Erebuni", "Armenia", "Van", "Hayastan"};
        String[]erkrord = new String [arajin.length];
        mecChorsic(arajin,erkrord,z);
    }

    public static void mecChorsic(String[] array, String[] mihatelarray,int x){
        for (int i = 0; i < array.length; i++){
            if (array[i].length()<x){
                mihatelarray[i]=array[i];
                System.out.print("["+mihatelarray[i]+"]");

            }
        }

    }
}
