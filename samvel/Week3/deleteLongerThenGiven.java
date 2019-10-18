package Week3;

public class deleteLongerThenGiven {
    public static String[] removeLongStrings (String[] arr, int length) {
        int counter = 0;
        for (String s : arr) {
            if (s.length() < length) {
                counter++;
            }
        }

        String[] modifiedArray = new String[counter];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i].length() < length) {
                modifiedArray[j] = arr[i];
                j++;
            }
        }

        return modifiedArray;
    }

    public static void main (String[] args) {
        String[] noLong = {"this", "not", "too", "long"};
        String[] removedLongs = removeLongStrings(noLong, 4);

        for (String removedLong : removedLongs) {
            System.out.println(removedLong);
        }
    }
}
