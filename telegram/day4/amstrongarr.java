package telegram.day4;

public class amstrongarr {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++){
            int sum=0;
            int orginal=i;
            int degit=String.valueOf(i).length();
            int temp=i;
            while (temp>0) {
                int ls=temp%10;
                sum+=Math.pow(ls, degit);
                temp=temp/10;
            }
            if(sum==orginal){
                System.out.println(orginal);
            }
        }
        
    }
}
