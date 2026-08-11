package telegram.day17;

public class Secoundsmallestnumber {
    public static void main(String[] args) {
        int arr[]={12,13,1,10,34,1};
        int small1=Integer.MAX_VALUE;
        int small2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small1>arr[i]){
                small2=small1;
                small1=arr[i];
            }
            else if(arr[i]<small2 && arr[i]!=small1){
                small2=arr[i];
            }
        }
        // System.out.println(small1);
        System.out.println(small2);
    }
}
