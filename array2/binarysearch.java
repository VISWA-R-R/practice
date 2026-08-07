package array2;

public class binarysearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int find=7;
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==find){
                System.out.println(mid);
                break;
            } 
            else if(a[mid]<mid){
                i=mid+1;
                
            }
            else i=mid-1;

        }

    }
}
