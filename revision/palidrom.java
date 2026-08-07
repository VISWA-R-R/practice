package revision;

public class palidrom {
    public static void main(String[] args) {
        int a=121;
        int num=a;
        int rev=0;
        while(a>0){
            int ls=a%10;
            rev=rev*10+ls;
            a=a/10;
        }
        if (num==rev) {
            System.out.println("it is palidrom");
        }
        else{
            System.out.println("not a palidrom");
        }
    }
}
