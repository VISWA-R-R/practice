package praticejava.day35;

import java.util.Arrays;

public class LeftrotateKrotate {
    public static void main(String[] args) {
        int arr[]={2,1,1,2,2};
        int rev[]=new int[arr.length];
        for(int i=0;i<2;i++){
            int k=arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=k;
        }
        for(int i=arr.length-1;i>=0;i--){
            rev[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rev));
        if(Arrays.equals(arr, rev)){
            System.out.println("it is palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
