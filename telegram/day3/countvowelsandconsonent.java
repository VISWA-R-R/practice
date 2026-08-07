package telegram.day3;

public class countvowelsandconsonent {
    public static void main(String[] args) {
        String str="helloworld";
        String str2=str.toLowerCase();
        int vowels=0;
        int consonent=0;
        for(int i=0;i<str.length();i++){
            char c=str2.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels++;
            }
            else{
                consonent++;
            }
        }
        System.out.println(vowels+" "+consonent);
    }
}
