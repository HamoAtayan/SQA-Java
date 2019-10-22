package Week3;

public class ErkchapeMiachapi {


    public static void main(String[] args){
        int[][] chorordMasiv = {{55, 89, 6, 75, 15, 29}, {78, 3, 65, 13}};


        for(int i=0;i<chorordMasiv.length;i++){
            for(int j=0;j<chorordMasiv[0].length;j++){
                System.out.print("[" + chorordMasiv[i][j]+ "]");
            }
        }
    }
}
