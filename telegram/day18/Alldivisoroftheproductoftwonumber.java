package telegram.day18;

public class Alldivisoroftheproductoftwonumber {
    public static void main(String[] args) {
        int num1=6;
        int num2=10;
        int product=num1*num2;
        // System.out.println(product);
        for(int i=1;i<=product/2;i++){
            if(product%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
