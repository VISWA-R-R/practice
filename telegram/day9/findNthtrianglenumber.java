package telegram.day9;

public class findNthtrianglenumber {
    public static void main(String[] args) {
        int n=4;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        // int triangle=n*(n+1)/2;
        System.out.println(sum);
    }
}
