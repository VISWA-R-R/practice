package telegram2.Day3;

public class LargestandSmallestnumber {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,8,1,};
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("small = "+small+" "+"large = "+large);
    }
}
