package array;

import java.util.Arrays;

public class chartoarr {
    public static void main(String[] args) {
        char[] a={'A','B','C','D'};
        int arr[]=new int[a.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=a[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
