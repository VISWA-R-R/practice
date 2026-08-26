package telegram.day30;

public class Patternwithincreasingcharacter {
    public static void main(String[] args) {
        int n=3;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ch=(char)('A'+k-1);
                System.out.print(ch);
                k++;
            }
            System.out.println();
        }
    }
}
