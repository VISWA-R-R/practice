package telegram.day17;
public class Palindromicnumberinarange {
    public static boolean ispalindrom(int a){
        int num=a;
        int num2=num;
        int rev=0;
        while(num>0){
            int ls=num%10;
            rev=rev*10+ls;
            num=num/10;
        }
        if(num2==rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int start=1;
        int end=100;
        for(int i=start;i<=end;i++){
            ispalindrom(i);
            if(ispalindrom(i)){
                System.out.print(i+", ");
            }
        }
    }
}
