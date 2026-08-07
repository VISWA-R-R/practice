package telegram.day11;

public class Countstringwithoutusinbildinfunction {
    public static void main(String[] args) {
        String str="hello";
        char c[]=str.toCharArray();
        int count=1;
        for(int i=1;i<c.length;i++){
            count++;
        }
        System.out.println(count);
    }
}
