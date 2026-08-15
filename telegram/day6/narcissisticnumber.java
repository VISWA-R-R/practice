package telegram.day6;

public class narcissisticnumber {
    public static void main(String[] args) {
        int n=153;
        int orginal=n;
        int digit=String.valueOf(n).length();
        System.out.println(digit);
        int sum=0;
        while(n>0){
            int ls=n%10;
            sum+=Math.pow(ls,digit);
            n=n/10;
        }
        if(orginal==sum){
            System.out.println("it is narciccistic number");
        }
        else{
            System.out.println("not a narciccistic number");
        }
    }
}
