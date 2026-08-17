package telegram.day23;

public class FindthelengthoftheLongestword {
    public static void main(String[] args) {
        String str="Find the longest word";
        String str2[]=str.split(" ");
        int maxlength=Integer.MIN_VALUE;

        for(int i=0;i<str2.length;i++){
            if(str2[i].length()>maxlength){
                maxlength=str2[i].length();
            }
        }
        System.out.println(maxlength);
    }
}
