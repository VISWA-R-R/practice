package telegram.day32;

public class Patternwithalternaterowandcolumn {
    public static void main(String[] args) {
        int n=3;
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
