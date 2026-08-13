package telegram.day19;

public class Sumoffirstnfibonaccinumber {
    public static void main(String[] args) {
        int N=5;
        int firstnum=1;
        int secoundnum=1;
        int nextnum;
        int sum=0;
        for(int i=0;i<N;i++){
            sum=sum+firstnum;
            nextnum=firstnum+secoundnum;
            firstnum=secoundnum;
            secoundnum=nextnum;
        }
        System.out.println(sum);
    }
}
