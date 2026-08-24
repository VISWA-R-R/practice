package telegram.day28;

public class Printzigzagpattern {
    public static void main(String[] args) {
        int n=3;
        int rows=n;
        int cols=4;
        int num=1;
        for(int i=0;i<rows;i++){
            if(i%2==0){
                for(int j=0;j<cols;j++){
                    System.out.print(num+" ");
                    num++;
                }
            }else{
                int start=num+cols-1;
                for(int j=start;j>=num;j--){
                    System.out.print(j+" ");
                }
                num=num+cols;
            }
            System.out.println();
        }
    }
}
