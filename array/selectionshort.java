package array;

import java.util.Arrays;

public class selectionshort {
    public static void main(String[] args) {
        int arr[]={2,4,3,6,5,7,9,8,1};
        for(int i=0;i<arr.length;i++){
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
