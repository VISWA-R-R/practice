package telegram.day19;

public class NumberofwordsinString {
    public static void main(String[] args) {
        String str="Hello world";
        String str2[]=str.split(" ");
        int count=0;
        for(int i=0;i<str2.length;i++){
            count++;
        }
        System.out.println(count);
    }
}
