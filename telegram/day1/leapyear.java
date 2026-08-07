package telegram.day1;

public class leapyear {
    public static void main(String[] args) {
        int a=2020;
        if(a%400==0 || (a%4==0 && a%100!=0)){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
