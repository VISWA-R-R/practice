package array;

public class binarysearch {
    public static int binary1(int[] arr,int find){
        int i=0;
        int j=arr.length-1;
        while (i<=j) { 
            int mid=(i+j)/2;
            if(arr[mid]==find) return mid;
            else if(arr[mid]<find) i=mid+1;
            else i=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int find=10;

        int index=binary1(arr, find);
        System.out.println(index);
    }
}
