package array;

import java.util.Arrays;

public class Swapalternate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length-1;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
