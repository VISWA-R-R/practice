package telegram.day15;

public class Sumofnumberinstring {
    public static void main(String[] args) {
        String str="the number are 12 and 34";
        int sum=0;
        int number=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');
            }
            else{
                sum=sum+number;
                number=0;
            }
        }
        sum=sum+number;
        System.out.println(sum);
    }
}
