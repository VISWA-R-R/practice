package telegram.day5;

public class findthenumberofdigit {
    public static void main(String[] args) {
        int n=12345;
        // int digit=String.valueOf(n).length();
        // System.out.println(digit);
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
