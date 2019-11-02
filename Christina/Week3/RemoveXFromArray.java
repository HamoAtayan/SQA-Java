package Week3;

/**
 * Created by Christina Mnoyan on Oct, 2019
 */
public class RemoveXFromArray {
    public static void main(String[] args) {
        String[] array = {"xxxxxxPut", "onxxxx", "yourx", "haxxppy", "xxxfaxxcexxx!!!"};
        for (String removed : elementRemover(array)) {
            System.out.print(String.format("{ %s }",removed ));
        }
    }

    private static String[] elementRemover(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replaceAll("x", "");
        }
        return array;
    }
}
