package praticejava.day33;

public class Primenumber {
    public static void main(String[] args) {
        int number=7;
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
            
        }
        if(count==2){
            System.out.println("it is prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }
}
