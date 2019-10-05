package Week1;

import java.util.Scanner;

public class DistanceBetweenCities {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double lat1, lat2; //Latitude for City 1 and 2
        double long1, long2; // Longitude for City 1 and 2
        double longDiff, latDiff; //Difference in latitude and longitude
        double distanceSquare;
        double t;
        double middleLat;
        double middleLong;
        //Input our coordinates for two cities
        System.out.println("Please enter latitude for city1: ");
        lat1 = input.nextDouble();
        System.out.println("Please enter longitude for city1: ");
        long1 = input.nextDouble();
        System.out.println("Please enter latitude for city2: ");
        lat2 = input.nextDouble();
        System.out.println("Please enter longitude for city2: ");
        long2 = input.nextDouble();
        //check which coordinate is bigger
        double maxLat = (lat1 < lat2) ? lat2:lat1;
        double maxLong = (long1 < long2) ? long2:long1;
        double minLat = (lat1 < lat2) ? lat1:lat2;
        double minLong = (lat1<lat2) ? lat1:lat2;
        if (lat1 == lat2 && long1 == long2)
            System.out.println("Your coordinates for both cities are the same! ");
        //calculate differences
        longDiff = maxLong - minLong;
        latDiff = maxLat - minLat;
        //calculate actual distance a^2 + b^2 = c^2 - via Pythagoras theorem
        distanceSquare = longDiff*longDiff + latDiff*latDiff;
        //calculate root of distanceSquare
        double distanceRoot = distanceSquare / 2;
        do {
            t = distanceRoot;
            distanceRoot = (t + (distanceSquare/t)) / 2;
        } while ((t - distanceRoot) != 0);
        input.close();
        System.out.println("Distance between City 1 and City two is: " + distanceRoot);
        // Now find middle coordinates
        middleLat = latDiff / 2;
        middleLong = longDiff / 2;
        System.out.println("Coordinates of middle point are following: ");
        System.out.println("Latitude: " + middleLat + " Longitude: " + middleLong);

    }
}
