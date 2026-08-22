package telegram.day28;

public class SpriralMatrix {
    public static void main(String[] args) {
        int n=3;
        int matrix[][]=new int[n][n];
        int top=0;
        int bottum=n-1;
        int left=0;
        int right=n-1;
        int num=1;
        while(top<=bottum && left<=right){
            for(int i=left;i<=right;i++){
                matrix[top][i]=num;
                num++;
            }
            top++;
            for(int i=top;i<=bottum;i++){
                matrix[i][right]=num;
                num++;
            }
            right--;
            for(int i=right;i>=left;i--){
                matrix[bottum][i]=num;
                num++;
            }
            bottum--;
            for(int i=bottum;i>=top;i--){
                matrix[i][left]=num;
                num++;
            }
            left++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
