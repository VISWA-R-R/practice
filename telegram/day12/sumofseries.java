package telegram.day12;

public class sumofseries {
    public static void main(String[] args) {
        int n=4;
        double sum=0.0;
        for(int i=1;i<=n;i++){
            sum=sum+(1.0/i);
            
        }
        System.out.println(sum);
    }
}
