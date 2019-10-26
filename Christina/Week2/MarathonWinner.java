package Week3;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class MarathonWinner {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        String firstPlaceWinner = names[minValueIndexCounter(times)];
        String secondPlaceWinner = names[secondMinValueCounter(times)];
        System.out.println("In first place is " + firstPlaceWinner + " with " + times[minValueIndexCounter(times)] + " seconds result");
        System.out.println("In second place is " + secondPlaceWinner + " with " + times[secondMinValueCounter(times)] + " seconds result");
    }

    private static int minValueIndexCounter(int[] args) {
        int minValueIndex = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < args[minValueIndex]) {
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }

    private static int secondMinValueCounter(int[] args) {
        int minSecondValueIndex = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] > args[minValueIndexCounter(args)]) {
                if (args[i] < args[minSecondValueIndex]) {
                    minSecondValueIndex = i;
                }
            }
        }
        return minSecondValueIndex;
    }
}

