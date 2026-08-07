package telegram.day8;

import java.util.Arrays;

public class medianofarray {
    public static void main(String[] args) {
        int arr[]={3,1,2,4,5};
        int middle;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        middle=(arr.length)/2;
        System.out.println(arr[middle]);
    }
}
