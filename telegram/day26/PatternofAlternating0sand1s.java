package telegram.day26;

public class PatternofAlternating0sand1s {
    public static void main(String[] args) {
        int n=4;
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j%2==0){
                    System.out.print(matrix[i][j]=0);
                }
                else{
                    System.out.print(matrix[i][j]=1);
                }
            }
            System.out.println();
        }
    }
}
