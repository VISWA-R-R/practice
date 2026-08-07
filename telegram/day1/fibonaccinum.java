package telegram.day1;

public class fibonaccinum {
    public static void main(String[] args) {
        int n=10;
        int startnum=0;
        int secoundnum=1;
        int nextnum;
        for(int i=1;i<n-2;i++){
            System.out.print(startnum+", ");
            nextnum=startnum+secoundnum;
            startnum=secoundnum;
            secoundnum=nextnum;
        }
    }
}
