package Week3;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class DeleteLongElements {
    public static void main(String[] args) {
        String[] noLong = {"It", "is", "a", "long", "sentence", "car"};
        String[] withoutLongs = deleteUntilTheGivenSize(noLong, 4);
        for (String values : withoutLongs) {
            System.out.println(values);
        }

    }

    private static String[] deleteUntilTheGivenSize(String[] args, int size) {
        int index = 0;
        for (String values : args) {
            if (values.length() < size) {
                index++;
            }
        }
        String[] modifiedArray = new String[index];
        for (int i = 0, j = 0; i < args.length; i++) {
            if (args[i].length() < size) {
                modifiedArray[j] = args[i];
                j++;
            }
        }
        return modifiedArray;
    }

}
