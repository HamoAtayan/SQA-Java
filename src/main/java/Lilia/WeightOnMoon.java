package Lilia;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class WeightOnMoon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight=");
        float Weight = input.nextFloat();
        double MoonWeight = Weight * 0.17;
        if(Weight<=0) {
            System.out.println("Please enter a positive number");
        }else
            System.out.println("your weight on moon is=" + MoonWeight);
    }
}