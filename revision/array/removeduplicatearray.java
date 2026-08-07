package revision.array;

public class removeduplicatearray {
    public static void main(String[] args) {
        int arr[]={4,3,2,1,4,5,1,6};
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}
