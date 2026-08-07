package array;

import java.util.Arrays;

public class Boobleshort1 {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,6,5,9,8,7};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                System.out.print(arr[j]+","+arr[j+1]);
                System.out.println("\t");
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
