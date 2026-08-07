package telegram.day13;

public class sumoffirstsumoddnumber {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int odd=1;
        for(int i=1;i<=n;i++){
            sum=sum+odd;
            odd=odd+2;
            
        }
        System.out.println(sum);
    }
}
