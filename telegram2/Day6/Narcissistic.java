package telegram2.Day6;

public class Narcissistic {
    public static void main(String[] args) {
        int number=153;
        int orgnum1=153;
        int digit=0;
        while(number>0){
            digit++;
            number=number/10;
        }
        number=orgnum1;
        int sum=0;
        while(number>0){
            int ls=number%10;
            sum=sum+(int)(Math.pow(ls, digit));
            number=number/10;
        }
        // System.out.println(orgnum1);
        // System.out.println(sum);
        if(orgnum1==sum){
            System.out.println("it is narcissistic number");
        }
        else{
            System.out.println("it not narcissistic number");
        }
    }
}
