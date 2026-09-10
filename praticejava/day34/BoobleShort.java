package praticejava.day34;

import java.util.Arrays;

public class BoobleShort {
    public static void main(String[] args) {
        int arr[]={7,6,3,4,9,1,2};
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
