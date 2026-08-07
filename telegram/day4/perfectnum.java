package telegram.day4;

public class perfectnum {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println(sum);
        if(sum==n){
            System.out.println("it is a perfect number");
        }
        else{
            System.out.println("it is not pefect number");
        }
    }
}
