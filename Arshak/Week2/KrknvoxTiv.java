package Week3;

public class KrknvoxTiv {
    public static void main(String[] args) {

        int[] mek = {341, 273, 278, 329, 789, 445};
        int[] erku = {789, 273, 45, 22, 12, 456, 957};

        for (int i = 0; i < mek.length; i++) {
            for (int j = 0; j < erku.length; j++) {
                if (mek[i] == erku[j]) {
                    System.out.println(mek[i]);
                }
            }
        }
    }
}
