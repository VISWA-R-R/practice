package telegram.day13;

public class matrixmultiplicationtable {
    public static void main(String[] args) {
        int size=3;
        int num=1;
        int[][] matix=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                // matix[i][j]=num;
                // num++;
                matix[i][j]=(i+1)*(j+1);
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
