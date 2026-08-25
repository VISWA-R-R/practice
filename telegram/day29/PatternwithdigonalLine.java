package telegram.day29;

public class PatternwithdigonalLine {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            char ch=(char)('A'+i);
            System.out.print(ch);
            if(i>0){
                for(int j=0;j<2*i-1;j++){
                    System.out.print(" ");
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
