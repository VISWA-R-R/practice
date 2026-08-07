package telegram.day3;

public class findsmallandlarge {
    public static void main(String[] args) {
        int arr[]={4,7,1,8,5};
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            else if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(large);
        System.out.println(small);
    }
}
