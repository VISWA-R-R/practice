package telegram.day4;

import java.util.Scanner;

public class findtheprimenuminrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting range ");
        int start=sc.nextInt();
        System.out.print("enter the ending range ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+"it is prime number"+count);
            }
        }
    }
}
