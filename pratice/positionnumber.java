package pratice;

public class positionnumber {
    public static void main(String[] args) {
        int arr[]={4,6,5,3,8,3,5,5,4,7,5};
        int target=5;
        int count1=0;
        int count2=0;
        int maxcount=Integer.MIN_VALUE;
        int mincount=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count1++;
                count2++;
                // System.out.println(count1);
                if(count1<mincount){
                    mincount=i;
                }
            }
            if(count2>maxcount){
                count2++;
                maxcount=i; 
            }
        }
        System.out.println(mincount+","+maxcount);
    }
}
