package revision;

public class happynum {
    public static void main(String[] args) {
        int a=19;
        while(a>9){
            int square=0;
        while (a>0) {
            int ls=a%10;
            square=square+(ls*ls);
            a=a/10;
        }
        a=square;
    }
    if (a==1) {
     System.out.println("it is happy number");
    }
    else{
     System.out.println("not happy number");
    }
    }
}
