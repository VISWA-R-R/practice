package telegram.day27;

public class Checkerboardpattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if((i+j)%2==0){
                    System.out.print("X");
                }
                else System.out.print("O");
            }
            System.out.println();
        }
    }
}
