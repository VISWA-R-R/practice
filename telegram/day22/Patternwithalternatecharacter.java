package telegram.day22;

class Patternwithalternatecharacter {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                if((i+j)%2==0){
                    System.out.print("A");
                }
                else{
                    System.out.print("B");
                }
            }
            System.out.println();
        }
    }
}