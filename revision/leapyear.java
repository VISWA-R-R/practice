package revision;
public class leapyear {
    public static void main(String[] args) {
        int year=2025;
        if((year%400==0) || (year%100!=0 && year%4==0)){
            System.out.println("it is leap year "+year);
        }
        else{
            System.out.println("it is not a leap year "+year );
        }
    }
}
