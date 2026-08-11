package telegram.day17;

public class sumofdigitoftheproductoftwonumber {
    public static void main(String[] args) {
        int num1=12;
        int num2=34;
        int num3=num1*num2;
        System.out.println(num3);
        int sum=0;
        while(num3>0){
            int ls=num3%10;
            sum=sum+ls;
            num3=num3/10;
        }
        System.out.println("sum of product of two number = "+sum);
    }
}
