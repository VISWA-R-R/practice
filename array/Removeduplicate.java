package array;

import java.util.Arrays;

public class Removeduplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,1,8};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
