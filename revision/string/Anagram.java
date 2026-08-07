package revision.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="heart";
        String str2="earth";
        char c[]=str1.toCharArray();
        char c2[]=str2.toCharArray();
        Arrays.sort(c2);
        Arrays.sort(c);
        System.out.println(c);
        System.out.println(c2);
        if(Arrays.equals(c,c2)){
            System.out.println("it is Anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}
