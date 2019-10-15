package Week2;


public class MijinTvabanakan {
    public static void main(String[] args) {
        int[] chorordMasiv = new int[10];
        for (int i = 0; i < chorordMasiv.length; i++) {
            chorordMasiv[i] = (int) ((Math.random() * 10));
        }
        double mijin = 0;
        for (int i = 0; i < chorordMasiv.length; i++) {
            mijin = mijin + chorordMasiv[i];

        }
        System.out.println("Mijin tvabanakann e = " + mijin / 10);

    }
}