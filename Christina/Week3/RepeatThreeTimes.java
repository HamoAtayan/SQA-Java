package Week3;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class RepeatThreeTimes {
    public static void main(String[] args) {
        String[] array = {"Why", "so", "Serious?"};
        System.out.println("The copied array is:");
        for (String values : conCatTheString(array)){
        System.out.println(values);
        }


    }

    private static String[] conCatTheString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].concat(array[i].concat(array[i]));
        }
        return array;
    }

}
