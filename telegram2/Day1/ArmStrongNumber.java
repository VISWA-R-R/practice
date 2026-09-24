package telegram2.Day1;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num=153;
        int originnum=num;
        int count=0;
        int sum=0;
        while (num>0) {
            count++; 
            num=num/10;
        }
        // System.out.println(count);
        num=originnum;
        while(num>0){
            int ls=num%10;
            // System.out.println(ls);
            sum=sum+(int)Math.pow(ls, count);
            num=num/10;
        }
        // System.out.println(sum);
        if(sum==originnum){
            System.out.println("it is amstrong number");
        }
        else{
            System.out.println("it is not a amstrong number");
        }
    }
}
