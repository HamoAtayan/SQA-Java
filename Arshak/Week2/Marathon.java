package Week3;

public class Marathon {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil"};
        int[] times = {341, 273, 278, 329, 445};
        int min = times[0];
        int index = 0;


        for (int i = 1; i < times.length; i++) {
            if (times[i] < min) {
                min = times[i];
                index = i;

            }

        }
        System.out.println("Lavaguyn jamanak" + " " + "=" + " " + min);
        System.out.println("Haxtox =" + " " + names[index]);


    }
}
