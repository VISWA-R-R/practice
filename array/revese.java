package array;

import java.util.Arrays;

public class revese {
    public static void main(String[] args) {
        int arr[]={9,8,6,4,3,2,1};
        int f=0;
        int l=arr.length-1;
        while (f<l) { 
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            f++;
            l--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
