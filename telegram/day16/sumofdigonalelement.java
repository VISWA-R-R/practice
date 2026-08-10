package telegram.day16;

public class sumofdigonalelement {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
