package praticejava.day35;

public class Removeduplicateinarr {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,1,2,2,3,3,3,4};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
