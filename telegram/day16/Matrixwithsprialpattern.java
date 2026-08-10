package telegram.day16;

public class Matrixwithsprialpattern {
    public static void main(String[] args) {
        int size=3;
        int matrix[][]=new int[size][size];
        int top=0;
        int bottom=size-1;
        int left=0;
        int right=size-1;
        int num=1;
        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                matrix[top][i]=num;
                num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num;
                num++;
            }
            right--;
            for(int i=right;i>=left;i--){
                matrix[bottom][i]=num;
                num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                matrix[i][left]=num;
                num++;
            }
            left++;
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
