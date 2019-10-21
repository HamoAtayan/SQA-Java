package Week3;

import java.util.Arrays;

public class FastestRunner {
    public static void main(String[] args) {
        String[] names = {"Elena", "Tjomas", "Hamilton", "Suzie", "Phill", "Matt", "Alex", "Emma", "John", "James",
                "Jane", "Emily", "Daniel", "Neda", "Auron", "Katarina"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        int fastest = times[0];
        int secondFastes = times[0];
        int indexOfFastest = 0;
        int indexOfSecondFastest = 0;

        for (int i=1; i<times.length; i++) {
            if (times[i] < fastest) {
                secondFastes = fastest;
                fastest = times[i];
                indexOfFastest = i;
            }
            else if (times[i] < secondFastes) {
                secondFastes = times[i];
                indexOfSecondFastest = i;
            }
        }

        String firstPlaceWinner = names[indexOfFastest];
        String secondPlaceWinner = names[indexOfSecondFastest];
        System.out.println("First place winner is: " + firstPlaceWinner + " : he came to finish in " + fastest + " seconds");
        System.out.println("Second place winner is: " + secondPlaceWinner + " : he came to finish in " + secondFastes + " seconds");
    }
}
