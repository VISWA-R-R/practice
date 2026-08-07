package revision.string;

import java.util.LinkedHashSet;

public class removeduplicatebylinkedset {
    public static void main(String[] args) {
        String str="aaaaabbbbbbccccdefg";
        LinkedHashSet<Character> string=new LinkedHashSet<>();
        for(char c:str.toCharArray()){
            string.add(c);
        }
        for(char ch:string){
            System.out.print(ch);
        }
    }
}
