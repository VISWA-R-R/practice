package telegram.day25;

public class Printdimandpatternwithnumber {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
