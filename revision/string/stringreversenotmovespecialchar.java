package revision.string;

public class stringreversenotmovespecialchar {
    public static void main(String[] args) {
        String str="v@i#s$w%a";
        char c[]=str.toCharArray();
        int i=0;
        int j=c.length-1;
        while (i<j) {
            if(!Character.isLetter(c[i])) i++;
            else if (!Character.isLetter(c[j])) j--;
            else{
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(c));
    }
}
