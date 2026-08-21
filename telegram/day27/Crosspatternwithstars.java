package telegram.day27;

public class Crosspatternwithstars {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                System.out.println("***");
            }
            else{
               System.out.println(" *");
            }
        }
    }
}
