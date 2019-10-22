package Week3;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class StringRevert {
    public static void main(String[] args) {
        String input = "Vahram";
        System.out.println(revertTheString(input));
    }

    public static String revertTheString(String input) {
        char[] reversedArray = new char[input.length()];
        int y = 0;
        for (int i = reversedArray.length - 1; i >= 0; i--) {
            reversedArray[y] = input.charAt(i);
            y++;
        }
        String reversedString = new String(reversedArray);
        return reversedString;
    }
}
