package telegram2.Day6;

public class PatternofNumber {
    public static void main(String[] args) {
        int rows=3;
        int num=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}