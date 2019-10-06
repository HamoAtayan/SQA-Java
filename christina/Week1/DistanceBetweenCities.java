package Week1;

import java.util.Scanner;

/**
 * Created by Christina Mnoyan on Sep, 2019
 */
public class DistanceBetweenCities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first city's coordinates:");
        double firstLatitude = sc.nextDouble();
        double firstLongitude = sc.nextDouble();
        System.out.println("Enter the second city's coordinates:");
        double secondLatitude = sc.nextDouble();
        double secondLongitude = sc.nextDouble();

        DistanceCounter(firstLatitude, firstLongitude, secondLatitude, secondLongitude);
        AveragePointCounter(firstLatitude, firstLongitude, secondLatitude, secondLongitude);
    }

    public static void DistanceCounter(double firstLatitude, double firstLongitude, double secondLatitude, double secondLongitude) {
        double distance = Math.sqrt(Math.pow(firstLongitude - firstLatitude, 2) + Math.pow(secondLongitude - secondLatitude, 2));
        System.out.println("The distance between 2 cities is " + distance + " kms");
    }

    public static void AveragePointCounter(double firstLatitude, double firstLongitude, double secondLatitude, double secondLongitude) {
        double pointLatitude = (firstLatitude + secondLatitude) / 2;
        double pointLongitude = (firstLongitude + secondLongitude) / 2;
        System.out.println("The latitude is " + pointLatitude);
        System.out.println("The longitude is " + pointLongitude);
    }
}
