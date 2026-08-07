package revision.string;

public class removeduplicate {
    public static void main(String[] args) {
        String str="aaabbbccc";
        String str2="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(str2.indexOf(c)==-1){
                str2=str2+c;
            }  
        }
        System.out.println(str2);
    }
}
