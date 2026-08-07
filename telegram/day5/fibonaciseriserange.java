package telegram.day5;

public class fibonaciseriserange {
    public static void main(String[] args) {
        int n=5;
        int firstnum=0;
        int secoundnum=1;
        int nextnum;
        for(int i=0;i<=n;i++){
            System.out.println(firstnum);
            nextnum=firstnum+secoundnum;
            firstnum=secoundnum;
            secoundnum=nextnum;
        }
    }
}
