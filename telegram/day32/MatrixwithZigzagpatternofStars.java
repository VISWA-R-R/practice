package telegram.day32;

public class MatrixwithZigzagpatternofStars {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
                if(i==0 || i==n-1){
                    System.out.print("* * *");
                }
                else if(i==1){
                    System.out.print(" * * ");
                }
                System.out.println();
            }
        
    }
}
