package telegram.day1;

public class Amstrongnum {
    public static void main(String[] args) {
        int n=153;
        int num=n;
        int anstron=0;
        while(n>0){
            int ls=n%10;
            anstron=anstron+(ls*ls*ls);
            System.out.println(anstron);
            n=n/10;

        }
        if(num==anstron){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("not a armstron number");
        }
    }
}
