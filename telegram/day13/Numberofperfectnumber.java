package telegram.day13;

public class Numberofperfectnumber {
    public static void main(String[] args) {
        int n=30;
        int perfectnum=0;
        for(int i=2;i<=n;i++){
            int sum=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum==i && i!=1){
                perfectnum++;
            }
        }
        System.out.println(perfectnum);
    }
}
