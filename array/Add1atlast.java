package array;

import java.util.Arrays;

public class Add1atlast {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int stor[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                stor[i]=arr[arr.length-1]+1;
               
            }
            else{
                stor[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(stor));
    }
}
