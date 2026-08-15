package telegram.day21;

import java.util.Arrays;

public class Findthelargestelementineachrow {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int result[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
            result[i]=max;
        }
        System.out.println(Arrays.toString(result));
    }
}
