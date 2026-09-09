package praticejava.day33;

public class Leepyear {
    public static void main(String[] args) {
        int year=2020;
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
