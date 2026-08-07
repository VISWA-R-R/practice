package revision.array;

public class missingnum {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        // int n=arr[arr.length-1]; //it is work on when the array is shorted
        int n=arr.length+1;
        // System.out.println(n);
        int value1=n*(n+1)/2;
        // System.out.println(value1);
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int value2=value1-sum;
        System.out.println(value2);
    }
}
