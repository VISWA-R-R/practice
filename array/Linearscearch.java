package array;

public class Linearscearch {
    public static int linear1(int[]arr,int search){

        for(int i=0;i<arr.length;i++){
            if (arr[i]==search) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int search=2;

        int index=linear1(arr, search);
        if (index>0) {
            System.out.println("it was present in the array "+index);
        }
        else{
            System.out.println("not present in the arr "+index);
        }
    }
}
