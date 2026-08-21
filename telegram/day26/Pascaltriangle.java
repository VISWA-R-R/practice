package telegram.day26;

public class Pascaltriangle {
    public static void main(String[] args) {
        int n=4;
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            // for(int j=0;j<=n-i;j++){
            //     System.out.print(" ");
            // }
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    System.out.print(matrix[i][j]=1);
                }
                else{
                    System.out.print(matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j]);
                }
            }
            System.out.println();
        }
    }
}
