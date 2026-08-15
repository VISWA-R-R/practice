package telegram.day21;

public class FrequencyofEachcharacterinaString {
    public static void main(String[] args) {
        String str="hello";
        int count=1;
        char c[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i++){
            if(c[i]==c[i+1]){
                count++;
            }
            else{
                System.out.print("'"+c[i]+"':"+count+" ");
                count=1;
            }
        }
        System.out.print("'"+c[str.length()-1]+"':"+count);
    }
}
