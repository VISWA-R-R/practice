package telegram.day13;

public class GCDcommondivisor {
    public static int GCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={12,24,36};
        int result=arr[0];
        for(int i=0;i<arr.length;i++){
            result=GCD(result, arr[i]);
        }
        System.out.println(result);
    }
}
