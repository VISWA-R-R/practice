package telegram.day32;

public class MatrixwithcrossPatternofnumber {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                // System.out.print("12321");
                int x=3;
                for(int j=1;j<=x;j++){
                    System.out.print(j);
                }
                for(int j=x-1;j>=1;j--){
                    System.out.print(j);
                }
            }
            else{
                // System.out.print("01210");
                int y=3;
                for(int j=0;j<y;j++){
                    System.out.print(j);
                }
                for(int j=y-2;j>=0;j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
