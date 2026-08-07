package revision.string;

public class palindromrev {
    public static void main(String[] args) {
        String str="racecar";
        String str2="racecar";
        // boolean rev=true;
        char[] c=str2.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i>j){
            // if(str.charAt(i)!=str.charAt(j)){
            //     rev=false;
            //     break;
            // }
            if(c[i]==c[j]){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }
            i++;
            j--;
        }
        if(str.equals(new String(c))){
            System.out.println("it is palindrom");
        }
        else{
            System.out.println("it is not palindrom");
        }
    }
}
