package revision.array;

import java.util.Arrays;

public class nthlargestarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9,8,7};
        int n=5;
        Arrays.sort(arr);
        System.out.println(n+" nth largest element is "+arr[arr.length-n]);
    }
}
