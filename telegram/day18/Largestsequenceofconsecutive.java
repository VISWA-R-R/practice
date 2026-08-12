package telegram.day18;

public class Largestsequenceofconsecutive {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        int count=1;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                count=1;
            } 
            maxcount=Math.max(maxcount, count);
        }
        System.out.println(maxcount);
    }
}
