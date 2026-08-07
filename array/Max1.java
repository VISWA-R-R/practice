package array;

public class Max1 {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,1,1,1,0,0,0,1,1,1};
        int count=0;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxcount=Math.max(count, maxcount);
            }
            else{
                count=0;
            }
        }
        System.out.println(maxcount);
    }
}
