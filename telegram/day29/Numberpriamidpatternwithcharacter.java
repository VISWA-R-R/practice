package telegram.day29;

public class Numberpriamidpatternwithcharacter {
    public static void main(String[] args) {
        int n=3;
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int k=0;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
