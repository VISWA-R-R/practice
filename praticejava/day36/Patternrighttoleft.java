package praticejava.day36;

public class Patternrighttoleft {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            int k=n-i;
            for(int j=0;j<n;j++){
                if(i+j>=n-1){
                    System.out.print(k);
                    k++;
                } 
                else{
                    System.out.print(" ");
                }               
            }
            System.out.println();   
        }
    }
}
