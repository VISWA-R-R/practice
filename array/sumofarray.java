package array;

public class sumofarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int targat=7;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==2 && arr[j]==5){
                    if(arr[i]+arr[j]==targat){
                        System.out.println(arr[i]+"+"+arr[j]+" = "+targat);
                    }
                }
            }
        }
    }
}
