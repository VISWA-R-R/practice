package telegram.day29;

public class PrintcrossPatternofStarswithdiagonal {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<2*n-1;i++){
                int spaces;
                int stars;
                if (i < n) {
                spaces = i;
                stars = n - i;
            } else {
                spaces = 2 * n - 2 - i;
                stars = i - n + 2;
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
