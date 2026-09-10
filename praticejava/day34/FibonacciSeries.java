package praticejava.day34;
public class FibonacciSeries {
    public static void main(String[] args) {
        int limit=10;
        int firstnum=0;
        int secountnum=1;
        int nextnum;
        for(int i=0;i<limit-3;i++){
            System.out.print(firstnum+" ");
            nextnum=firstnum+secountnum;
            firstnum=secountnum;
            secountnum=nextnum;
        }
    }
}
