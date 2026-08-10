package telegram.day16;

public class Perfectsquareinrange {
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++){
            // int num=i*i;
            int square=(int)Math.sqrt(i);
            if(square*square==i){
                System.out.println(i);
            }
        }
    }
}
