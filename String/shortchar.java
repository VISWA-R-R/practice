package String;

import java.util.Arrays;

public class shortchar {
    public static void main(String[] args) {
        String str="java is a programing language";
        String c[]=str.split(" ");
        for(int i=0;i<c.length;i++){
            char ch[]=c[i].toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);
            System.out.println(sortedWord);
        }
    }
}
