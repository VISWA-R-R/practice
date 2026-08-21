package telegram.day27;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        int n=3;
        int k=1;
        for(int i=n;i>=1;i--){
            char ch=(char)('A'+n-k);
            k++;
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
