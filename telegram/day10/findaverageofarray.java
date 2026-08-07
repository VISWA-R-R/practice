package telegram.day10;

public class findaverageofarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        int n=arr.length;
        int average;
        // System.out.println(n);
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            
        }
        System.out.println(sum);
        System.out.println(n);
        average=sum/n;
        System.out.println(average);
    }
}
