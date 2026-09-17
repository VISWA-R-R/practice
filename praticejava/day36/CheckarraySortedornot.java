package praticejava.day36;
public class CheckarraySortedornot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("it is shorted");
        }
        else{
            System.out.println("not shorted");
        }
    }
}
