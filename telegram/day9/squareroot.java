package telegram.day9;

public class squareroot {
    public static void main(String[] args) {
        int num=16;
        int root=(int)Math.sqrt(num);
        // System.out.println(root);
        if(root*root==num){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
