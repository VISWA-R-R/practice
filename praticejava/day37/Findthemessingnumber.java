package praticejava.day37;

public class Findthemessingnumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int n=arr.length+1;
        int res=n*(n+1)/2;
        int arr_sum=0;
        for(int i=0;i<arr.length;i++){            
            arr_sum+=arr[i];
        }
        System.out.println(res-arr_sum);

        // int max=0;
        // int arr_sum=0;
        // int max_sum=0;
        // for(int i=0;i<arr.length;i++){
        //     max=Math.max(max,arr[i]);
        //     arr_sum+=arr[i];
        // }
        // for(int i=1;i<=max;i++){
        //     max_sum+=i;
        // }
        // System.out.println(max_sum-arr_sum);
    }
}
