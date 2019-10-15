package week_2;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Marathon {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265};
        int firstPlace = times[0];
        String firstName = names[0];

        int secondPlace = times[0];
        String secondName = names[0];

        for (int i = 0; i < times.length; i++) {
            if (times[i] < firstPlace) {
                firstPlace = times[i];
                firstName = names[i];
            }

        }

        for (int i = 0; i < times.length; i++) {
            if (times[i] > firstPlace)
            if (times[i] < secondPlace) {
                secondPlace = times[i];
                secondName = names[i];
            }
        }

        System.out.println("First Place Runner is " + firstName + " " + firstPlace);
        System.out.println("Second Place Runner is " + secondName + " " +secondPlace);
    }
}
