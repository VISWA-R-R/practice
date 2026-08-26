package telegram.day30;

public class MatrixwithSprialDiagonal {
    public static void main(String[] args) {
        int n=3;
        int matrix[][]=new int[n][n];
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]=num);
                num++;
            }
            System.out.println();
        }
    }
}
