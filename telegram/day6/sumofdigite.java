package telegram.day6;

public class sumofdigite {
    public static void main(String[] args) {
        int n=4;
        int mul=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            mul=mul*i;
        }
        System.out.println(mul);
        while(mul>0){
            int ls=mul%10;
            sum=sum+ls;
            mul=mul/10;

        }
        System.out.println(n+sum);
    }
}
