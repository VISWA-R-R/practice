package telegram2.Day4;

public class PrimenuminaRange {
    public static void main(String[] args) {
        int st=10;
        int ed=20;
        for(int i=st;i<=ed;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}
