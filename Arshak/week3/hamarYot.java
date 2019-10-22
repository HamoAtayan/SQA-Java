package week3;
import java.util.Scanner;

public class hamarYot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq tive:");
        int x = input.nextInt();
        fiboTiv(x);
        System.out.println(fiboTiv(x));
    }



    static int fiboTiv(int i){

        if (i == 0){
            return 0;
        }
        if (i == 1){
            return 1;
        }
        else{
            return fiboTiv(i - 1) + fiboTiv(i- 2);
        }
    }
}
