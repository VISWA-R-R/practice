package telegram.day3;

public class revesestring {
    public static void main(String[] args) {
        String str="programming";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            rev=rev+c;
        }
        System.out.println(rev);
    }
}
