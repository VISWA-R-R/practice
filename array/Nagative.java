package array;

import java.util.Arrays;

public class Nagative {
    public static void main(String[] args) {
        int arr[]={1,2,-3,-4,-5,6,-7,8};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]>0 && arr[j]>0){
                j--;
            }
            else if(arr[i]>0 && arr[j]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(arr[i]<0 && arr[j]<0) i++;
            else{
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
