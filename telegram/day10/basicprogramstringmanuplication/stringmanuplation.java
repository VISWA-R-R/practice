package telegram.day10.basicprogramstringmanuplication;

public class stringmanuplation {
    public static void main(String[] args) {
        int num=122333;
        int digit=3;
        String str = String.valueOf(num);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==(digit+'0')){
                count++;
            }
        }
        System.out.println(count);
    }
}
