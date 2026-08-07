package telegram.day15;

public class largestprimenumber {
    public static void main(String[] args) {
        int num=28;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                int count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    max=i;
                }
            }
        }
        System.out.println(max);
    }
}
