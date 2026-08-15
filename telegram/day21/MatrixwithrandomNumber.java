package telegram.day21;

public class MatrixwithrandomNumber {
    public static void main(String[] args) {
        int row=2,column=3;
        int matrix[][]=new int[row][column];
        // int num=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               System.out.print( matrix[i][j]=(int) (Math.random()*10));
            //    num++;
            }
            System.out.println();
        }
        
    }
}
