package praticejava.day35;

import java.util.Arrays;

public class Margetwoshortedarray {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10,11,13,14,20};
        int arr3[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        } 
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
