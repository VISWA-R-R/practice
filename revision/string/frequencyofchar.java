package revision.string;

public class frequencyofchar {
    public static void main(String[] args) {
        String str="aaabbbcdeee";
        int count=1;
        char c[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i++){
            if(c[i]==c[i+1]){
                count++;
            }
            else{
                System.out.println(c[i]+" "+count);
                count=1;
            }
        }
        System.out.println(c[c.length-1]+" "+count);
    }
}
