public class countnum{
    public static void main(String[] args) {
        int a=12346;
        int count=0;
        while(a>0){
            a=a/10;
            count++;
            System.out.println(a+" "+count);
        }
        System.out.println(count);
    }
}