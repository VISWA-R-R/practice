package array2;

import java.util.Arrays;

public class rotation {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=4;
        for(int i=0;i<n;i++){
            int a=arr[0];
            System.out.println(a);
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];

            }
            arr[arr.length-1]=a;
            
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
