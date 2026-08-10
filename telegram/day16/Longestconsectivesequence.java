package telegram.day16;

public class Longestconsectivesequence {
    public static void main(String[] args) {
        int arr[]={100,4,200,1,2,3};
        int continue1=0;
        int count=1;
        for(int i=1;i<=arr.length-1;i++){
            for(int j=1;j<=i;j++){
                if(arr[i]==count){
                    continue1=arr[j];
                    count++;
                }
            } 
        }
        System.out.println(continue1);
    }
}
