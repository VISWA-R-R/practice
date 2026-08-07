package telegram.day2;

public class sumdigit {
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        while(num>0){
            int ls=num%10;
            sum=sum+ls;
            num=num/10;
        }
        System.out.println(sum);
    }
}
