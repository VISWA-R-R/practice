package telegram.day2;

public class stringpalindromes {
    public static void main(String[] args) {
        String str="radar";
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            str2=str2+c;
            System.out.println(str2);
        }
        if(str.equals(str2)){
            System.out.println("it is palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}
