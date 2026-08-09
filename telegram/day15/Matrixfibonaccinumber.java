package telegram.day15;

public class Matrixfibonaccinumber {
    public static void main(String[] args) {
        int size=3;
        int mat[][]=new int[size][size];
        int first=1;
        int secound=1;
        int next;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                mat[i][j]=first;
                next=first+secound;
                first=secound;
                secound=next;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
