package telegram.day18;

public class Cuntspecificwordinastring {
    public static void main(String[] args) {
        String str="hello world hello";
        String str2[]=str.split(" ");
        String word="hello";
        int count=0;
        for(int i=0;i<str2.length;i++){
            if(word.equals(str2[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
