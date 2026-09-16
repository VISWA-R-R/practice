package praticejava.day35;

import java.util.Arrays;

public class Rightrotate {
    public static void main(String[] args) {
        int arr[]={2,1,1,2,2};
        for(int i=0;i<2;i++){
            int k=arr[arr.length-1];
            for(int j=arr.length-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=k;
        }
        System.out.println(Arrays.toString(arr));
    }
}
