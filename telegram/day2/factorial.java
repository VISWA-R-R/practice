package telegram.day2;

public class factorial {
    public static void main(String[] args) {
        int num=5;
        int mul=1;
        for(int i=num;i>0;i--){
            mul=mul*i;
            System.out.print(i+"* "+mul+" ");
        }
        System.out.println();
        System.out.println(mul);
    }
}
