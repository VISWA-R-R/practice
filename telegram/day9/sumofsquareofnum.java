package telegram.day9;

public class sumofsquareofnum {
    public static void main(String[] args) {
        int num=123;
        int sum=0;
        while(num>0){
            int ls=num%10;
            sum=sum+(ls*ls);
            num=num/10;
        }
        System.out.println(sum);
    }
}
