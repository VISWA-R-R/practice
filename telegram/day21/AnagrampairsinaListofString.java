package telegram.day21;

public class AnagrampairsinaListofString {
    public static String shortstr(String n){
        char c[]=n.toCharArray();
        for(int i=0;i<n.length();i++){
            for(int j=0;j<n.length();j++){
                if(c[i]<c[j]){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        
        return new String(c);
    }
    public static void main(String[] args) {
        String str[]={"listen","silent","hello","world"};
        for(int i=0;i<str.length;i++){
            // System.out.println(shortstr(str[i]));
            for(int j=i+1;j<str.length;j++){
                if(shortstr(str[i]).equals(shortstr(str[j]))){
                    // System.out.println(str[i]);
                    System.out.println(str[i]+","+str[j]);
                }
            }
        }
    }
}
