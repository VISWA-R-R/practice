package pratice;

import java.util.Arrays;

public class Oddleftevenright {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int i=0;
        int j=arr.length;
        while(i<j){
            if(arr[i]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[i]=temp;
                i++;
                j--;
            }else{
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
