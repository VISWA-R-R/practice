package telegram2.Day3;

public class Vowelsandconsonent {
    public static void main(String[] args) {
        String str="hello world";
        int vowels=0;
        int consonent=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a' && c<='z'){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowels++;
                }
                else{
                    consonent++;
                }
            }
        }
        System.out.println(vowels+" "+consonent);
    }
}
