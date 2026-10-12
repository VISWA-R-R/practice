package telegram2.Day5;

public class SumofoddNumber {
    public static void main(String[] args) {
        int st=1;
        int ed=10;
        int sum=0;
        for(int i=st;i<=ed;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("sum of odd number is = "+sum);
    }
}
