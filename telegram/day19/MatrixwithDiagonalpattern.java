package telegram.day19;

public class MatrixwithDiagonalpattern {
    public static void main(String[] args) {
        int size=4;
        int num=1;
        int matrix[][]=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                matrix[i][j]=num;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
