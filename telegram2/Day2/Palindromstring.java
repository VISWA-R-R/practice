package telegram2.Day2;
public class Palindromstring {
    public static void main(String[] args) {
        String str="radar";
        char ch[]=str.toCharArray();
        String str2="";
        for(int i=ch.length-1;i>=0;i--){
            str2=str2+ch[i];
        }
        if(str.equals(str2)){
            System.out.println("it is palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}
