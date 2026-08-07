package array;

import java.util.Arrays;

public class rightrotate {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=arr.length;
        int last=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}
