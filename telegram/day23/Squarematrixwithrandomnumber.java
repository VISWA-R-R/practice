package telegram.day23;

public class Squarematrixwithrandomnumber {
    public static void main(String[] args) {
        int size=3;
        int matrix[][]=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print((matrix[i][j]=(int)(Math.random()*10))+" ");
                // System.out.print(" ");
            }
            System.out.println();
        }
    }
}
