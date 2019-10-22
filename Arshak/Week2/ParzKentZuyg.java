package Week3;


public class ParzKentZuyg {

    public static void main(String[] args) {


        int[] chorordMasiv = {55, 89, 6, 75, 15, 29, 78, 3, 65, 13};
        parzaTeChe(chorordMasiv);
        zuyg(chorordMasiv);
        kent(chorordMasiv);


    }

    public static void parzaTeChe(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            boolean isPrime = false;
            for (int y = 2; y < Math.sqrt(element); y++) {
                if (element % y == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println("Parz tvern en:" + element);
            }
        }

    }

    public static void zuyg(int[] array) {
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.println("Zuyg tvernen:" + value);
            }
        }
    }

    public static void kent(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Kent tvernen:" + array[i]);

            }
        }

        }
    }


