package array;

public class arrayuniqueornot {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5,6,1};
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                } 
            }
        }
        if (flag) System.out.println("it is not unique array");
        else System.out.println("it was unique array");
    }
}
