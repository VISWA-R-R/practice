package telegram.day31;

public class Checkerboardpattern {
    public static void main(String[] args) {
        int n=3;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(num%2!=0){
                    System.out.print("X");
                }else{
                    System.out.print("O");
                }
                num++;
            }
            System.out.println();
        }
    }
}
