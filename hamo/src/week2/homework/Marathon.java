package week2.homework;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class Marathon {
    static String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

    static int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
            317, 265};

    public static void main(String[] args) {
        BubbleSort(times);
        System.out.println("First place  is: " + names[0] + " in " + times[0] + " seconds");
        System.out.println("Secind place  is: " + names[1] + " in " + times[1] + " seconds");

    }

    public static void BubbleSort(int num[]) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1])   // change to > for ascending sort
                {
                    temp = num[j];                //swap elements
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
    }
}

