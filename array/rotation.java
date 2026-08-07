package array;

import java.util.Arrays;

public class rotation {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int n=3;
        for(int i=1;i<=n;i++){
            int first=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
