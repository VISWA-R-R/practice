package telegram2.Day5;

public class NumberofDigitsinaNumber {
    public static void main(String[] args) {
        int number=12345;
        int digit=0;
        while(number>0){
            digit++;
            number=number/10;
        }
        System.out.println(digit);
    }
}
