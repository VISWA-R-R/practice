package array2;

import java.util.Arrays;

public class selectionshort {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,8,0,1,5,7};
        for(int i=0;i<arr.length;i++){
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[k]>arr[j]){
                    k=j;
                }
            }
            int temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
            System.out.println(Arrays.toString(arr));
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
