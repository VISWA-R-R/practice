package telegram.day32;

public class MatrixwithZigzagpatternofStars {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
                if(i%2==0){
                    for(int j=0;j<n;j++){
                        System.out.print("* ");
                    }
                }else{
                    System.out.print(" ");
                    for(int j=0;j<n-1;j++){
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        
    }
}
