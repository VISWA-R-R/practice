package array;

public class Bildiglarge {
    public static void main(String[] args) {
        int arr[]={6,1,2,4,7,8,9};
        int count=0;
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                count++; 
                System.out.println(arr[i]);
                large=arr[i];
                
            } 
        }
        System.out.println(large+" "+count);
    }
}
