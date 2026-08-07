package array;

public class Arrayshortedornot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("it is not shorted");
        else System.out.println("it is shorted in assending");
    }
}
