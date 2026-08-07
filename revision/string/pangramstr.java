package revision.string;

public class pangramstr {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";
        String str2=str.toLowerCase();
        String panagram="";
        for(int i=0;i<str.length();i++){
            char c=str2.charAt(i);
            if(c>='a' && c<='z'){
            if(panagram.indexOf(c)==-1){
                panagram=panagram+c;
            }
        }
        }
        System.out.println(panagram.length());
        if(panagram.length()==26) System.out.println("it is pangram");
        else System.out.println("it is not pangram");
    }
}
