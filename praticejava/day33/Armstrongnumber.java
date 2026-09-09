package praticejava.day33;

public class Armstrongnumber {
    public static void main(String[] args) {
        int number=153;
        int originalnum=number;
        int sum=0;

        int digit=0;
        int temp=number;
        while(temp>0){
            digit++;
            temp=temp/10;
        }

        while(number>0){
            int ln=number%10;
            sum=sum+(int)(Math.pow(ln, digit));
            number=number/10;
        }
        if(sum==originalnum){
            System.out.println("it is amstrong");
        }
        else{
            System.out.println("it is not amstrong");
        }
    }
}
