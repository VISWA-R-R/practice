package array;

public class Twosum {
    public static void main(String[] args) {
        int arr[]={10,12,9,3,4,1};
        int target=11;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+","+arr[j]+" add "+(arr[i]+arr[j]));
                }
            }
        }
    }
}
