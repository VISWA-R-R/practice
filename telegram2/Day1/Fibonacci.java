package telegram2.Day1;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int firstnum=0;
        int secoundnum=1;
        int nextnumber;
        for(int i=0;i<n-3;i++){
            System.out.print(firstnum+", ");
            nextnumber=firstnum+secoundnum;
            firstnum=secoundnum;
            secoundnum=nextnumber;
        }
    }
}
