package telegram.day20;

public class Sumofsquare {
    public static void main(String[] args) {
        int n=4;
        // int square=n*n;
        // System.out.println(square);
        // int sum=square+n;
        // System.out.println(sum);
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum+(i*i);
            }
        }
        System.out.println(sum);
    }
}
