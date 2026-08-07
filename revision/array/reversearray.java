package revision.array;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int i=0;
        int j=arr.length-1;
        while (arr[i]>arr[j]) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
