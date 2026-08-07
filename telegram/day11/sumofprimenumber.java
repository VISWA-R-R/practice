package telegram.day11;

public class sumofprimenumber {
    public static void main(String[] args) {
        int n=12;
        int sum=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                sum=sum+i;
            }
        }
        }
        System.out.println(sum);
    }
}
