package telegram.day18;

public class Largestsequenceofconsecutive1s {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        int count=0;
        int maxcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            if(count>maxcount){
                maxcount=count;
            }
        }
        System.out.println(maxcount);
    }
}
