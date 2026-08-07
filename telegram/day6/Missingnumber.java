package telegram.day6;

public class Missingnumber {
    public static void main(String[] args) {
        int sequence[]={1,2,4,5};
        int n=sequence.length+1;
        int digit=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<sequence.length;i++){
            sum=sum+sequence[i];
        }
        System.out.println(digit-sum);
    }
}
