package telegram.day15;

public class SumofNprimenumber {
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        int count=0;
        int number=2;
        int sum=0;
        while(count<n){
            if(prime(number)){
                sum=sum+number;
                count++;
            }
            number++;
        }
        System.out.println(sum);
    }
}
