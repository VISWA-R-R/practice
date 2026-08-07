package revision.array;

public class secoundlargestarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9,8,7,10,11,11,12,12};
        int largestnum=Integer.MIN_VALUE;
        int secoundlargestnum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestnum){
                secoundlargestnum=largestnum;
                largestnum=arr[i];
            }
            else if (arr[i]!=largestnum && arr[i]>secoundlargestnum) {
                secoundlargestnum=arr[i];
            }
        }
        System.out.println(secoundlargestnum);
        System.out.println(largestnum);
    }
}
