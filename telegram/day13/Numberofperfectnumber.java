package telegram.day13;

public class Numberofperfectnumber {
    public static void main(String[] args) {
        int n=30;
        int perfectnum=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum==i){
                System.out.println(sum);
                perfectnum++;
            }
        }
        System.out.println(perfectnum);
    }
}
