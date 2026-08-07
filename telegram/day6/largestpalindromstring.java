package telegram.day6;

public class largestpalindromstring {
    public static void main(String[] args) {
        String str="babad";
        String palindrom="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String sub=str.substring(i,j);
                System.out.println(sub);
                if(isPalindrom(sub)){
                    if(sub.length()>=palindrom.length()){
                        palindrom=sub;
                    }
                }
            }
        }
        System.out.println(palindrom);
    }
    public static boolean isPalindrom(String s){
        int first=0;
        int end=s.length()-1;
        while(s.charAt(first)!=s.charAt(end)){
            return false;
        }
        first++;
        end--;
        return true;
    }
}
