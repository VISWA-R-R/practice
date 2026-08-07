package telegram.day8;

public class anagram {
    public static String shortstr(String str){
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length-1;j++){
                if(c[j]>c[j+1]){
                    char temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        return new String(c); 
    }
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        String s1=shortstr(str1);
        String s2=shortstr(str2);
        // System.out.println(s1);
        // System.out.println(s2);
        if(s1.equals(s2)){
            System.out.println("it is anagram");
        }
        else{
            System.out.println("not anagram");
        }
        
    }
}
