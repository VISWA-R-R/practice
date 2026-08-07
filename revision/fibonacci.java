package revision;

public class fibonacci {
    public static void main(String[] args) {
        int n=10, firstnum=0, secoundnum=1, nextnum;
        for(int i=1;i<=n;i++){
            System.out.print(firstnum+", ");
            nextnum=firstnum+secoundnum;
            firstnum=secoundnum;
            secoundnum=nextnum;
        }
    }
}
