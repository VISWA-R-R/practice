package telegram.day22;

public class patternwithSprialandzigzag {
    public static void main(String[] args) {
        int n=3;
        int num=1;
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]=num);
                    num++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(matrix[i][j]=num);
                    num++;
                }
            }
            System.out.println();
        }
    }
}
