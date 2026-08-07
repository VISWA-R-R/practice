package array;

public class Minandmax {
    public static void main(String[] args) {
        int arr[]={2,3,4,8,1,5,6,7};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        System.out.println(min);
        System.out.println(max);
    }
}
