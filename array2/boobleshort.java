package array2;

import java.util.Arrays;

public class boobleshort {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,9,1,3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
