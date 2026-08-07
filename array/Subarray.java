package array;

public class Subarray {
    public static void main(String[] args) {
        int arr[]={10,20,30};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+","+"=>"+sum);
                }
                sum=0;
                System.out.println("\t");
            }
            System.out.println();
        }
    }
}
