package revision;

import java.util.Scanner;

public class primenumberwithinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the start number ");
        int s=sc.nextInt();
        System.out.print("enter the end number ");
        int n=sc.nextInt();
        int count=0;
        for(int i=s;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("it is prime number");
        }
        else System.out.println("not a prime number");
    }
}
