package telegram.day23;

public class Alltriplesinanarraythesumofzero {
    public static int[] short1(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        int short2[]=short1(arr);
        // System.out.println(Arrays.toString(short2));
        

    }
}
