package telegram.day17;

public class Matrixwithalternate0and1 {
    public static void main(String[] args) {
        int size=3;
        int matrix[][]=new int[size][size];
        int count=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int num=count;
                count++;
                if(num%2==0){
                    matrix[i][j]=1;
                }
                else{
                    matrix[i][j]=0;
                }
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
