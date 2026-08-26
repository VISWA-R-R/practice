package telegram.day30;

public class TrianglematrixWithnumber {
    public static void main(String[] args) {
        int n=3;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
