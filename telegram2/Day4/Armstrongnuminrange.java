package telegram2.Day4;

public class Armstrongnuminrange {
    public static void main(String[] args) {
        int range1=1;
        int endrange=500;
        for(int i=range1;i<=endrange;i++){
            int num=i;
            int orgnum=num;
            int sum=0;
            int digit=0;

            while(num>0){
                digit++;
                num=num/10;
            }
            num=orgnum;
            while(num>0){
                int ls=num%10;
                sum=sum+(int)(Math.pow(ls, digit));
                num=num/10;
            }
            if(orgnum==sum){
                System.out.print(orgnum+" ");
            }
        }
    }
}
