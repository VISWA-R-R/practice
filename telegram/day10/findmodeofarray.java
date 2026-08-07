package telegram.day10;

public class findmodeofarray {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4};
        int mode=arr[0];
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>maxcount){
                    maxcount=count;
                    mode=arr[i];
                }
            }
        }
        System.out.println(mode);
    }
}
