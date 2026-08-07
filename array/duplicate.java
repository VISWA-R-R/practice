package array;

public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,1,9,9};
        boolean flag=false;
        int duplicate=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicate=arr[j];
                    flag=true;
                    // System.out.println(duplicate);
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("the duplicate is "+duplicate);
        }
        else{
            System.out.println("no duplicate value");
        }
    }
}
