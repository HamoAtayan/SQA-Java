package week2.homework;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class IsNumberExists {
    public static void main(String[] args) {
        isExist(1);
    }

    public static void isExist(int number) {
        int array[] = {1, 4, 8, 9, 5, 78, 9662, 14, 12, 15, 6, 65, 61, 85, 87, 54, 52};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == number) {
                System.out.println(array[i] + " exists!");
            } else {
                System.out.println(array[i] + " not exists!");
            }
        }
    }
}
