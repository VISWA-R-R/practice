package praticejava.day36;

import java.util.Arrays;

public class Movezerotoend {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,0,5,7,8,3,0};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(arr[i]!=0){
                i++;
            }
            else if(arr[j]==0){
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
