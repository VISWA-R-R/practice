package telegram.day11;

public class Numberpyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j<=i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
