package telegram.day26;

public class Rightangletrianglewithcharacter {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            char ch=(char)('A'+i-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
