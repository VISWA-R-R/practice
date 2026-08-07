package telegram.day9;

public class Sumofdigitofanumberuntillsingle {
    public static void main(String[] args) {
        int num=9875;
        int sum=0;
        int sum2=0;
        while(num>0){
            int ls=num%10;
            sum=sum+ls;
            num=num/10;

        }
        while(sum>9){
            int ls1=sum%10;
            sum2=sum2+ls1;
            System.out.println(sum);
            sum=sum/10;
        }
        System.out.println(sum);
    }
}
