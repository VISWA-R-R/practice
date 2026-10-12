package telegram2.Day5;

public class FibonacciNumberofspecificnumber {
    public static void main(String[] args) {
        int position=5;
        int fn=0;
        int sn=1;
        int nxn;
        for(int i=0;i<=10;i++){
            System.out.print(fn+", ");
            if(i==position){
                break;
            }
            nxn=fn+sn;
            fn=sn;
            sn=nxn;
        }
    }
}
