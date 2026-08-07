package telegram.day5;

import java.util.Scanner;

public class sumofevennumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the starting number : ");
        int start=sc.nextInt();
        System.out.print("enter the end number : ");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println(i);
                sum=sum+i;
            }  
        }
        System.out.println(sum);
    }
}
