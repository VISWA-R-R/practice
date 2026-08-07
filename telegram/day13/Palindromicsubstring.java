package telegram.day13;

public class Palindromicsubstring {
    static int count=0;
    public static void palindrom(String str,int left,int right){
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            count++;
            left--;
            right++;
        }
    }
    public static void main(String[] args) {
        String str="aaa";
        count=0;
        for(int i=0;i<str.length();i++){
            palindrom(str, i, i);
            palindrom(str, i, i+1);
        }
        
        System.out.println(count);
    }
}
