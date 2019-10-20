package Week2;

public class RemoveX {
    public static void main (String[] args) {
        String[] noX = {"x", "xa", "xii"};
        Remove(noX);
    }

    private static void Remove(String[] noX) {
        for(int i=0; i<=noX.length; i++) {
                String a = noX[i].replace("x","");
                System.out.println(a);
        }
    }
}
