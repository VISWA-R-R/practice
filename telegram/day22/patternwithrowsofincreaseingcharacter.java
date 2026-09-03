package telegram.day22;

public class patternwithrowsofincreaseingcharacter {
    public static void main(String[] args) {
        int n=3;
        int k=2;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-k;j++){
                char ch=(char)('A'+(num-1));
                System.out.print(ch);
                num++;
            }
            k--;
            System.out.println();
        }
    }
}
