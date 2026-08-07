package revision;

public class primenumber {
    public static void main(String[] args) {
        int a=5;
        int count=0;
        for(int i=1;i<=a;i++){
            if (a%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("it is prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    
    }
}
