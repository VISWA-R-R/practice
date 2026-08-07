package array;

public class elewithpair {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("["+arr[i]+","+arr[j]+"]"+"  ");
            }
            System.out.println();
        }
    }
}
