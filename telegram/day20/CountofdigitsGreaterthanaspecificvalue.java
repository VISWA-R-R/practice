package telegram.day20;

public class CountofdigitsGreaterthanaspecificvalue {
    public static void main(String[] args) {
        int num=54321;
        int value=3;
        int count=0;
        while(num>0){
            int ls=num%10;
            if(ls>value){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
