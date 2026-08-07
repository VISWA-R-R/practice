package telegram.day10.basicprogramstringmanuplication;

public class countspecificnumber {
    public static void main(String[] args) {
        int num=122333;
        int digit=3;
        int count=0;
        while(num>0){
            int ls=num%10;
            if(digit==ls){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
