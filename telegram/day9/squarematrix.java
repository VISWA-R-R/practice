package telegram.day9;

public class squarematrix {
    public static void main(String[] args) {
        int size=3;
        int[][] matrix=new int[size][size];
        int num=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]=num;
                num++;
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
