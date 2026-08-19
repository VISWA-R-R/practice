package pratice;
public class twosum {
    public static void main(String[] args) {
        int n[]={1,3,8,9,7,9,5,6,3};
        int target=12;
        int i=0;
        int j=n.length-1;
        while(i<n.length-1){
            if(n[i]+n[j]==target){
                System.out.println(i+","+j);
                j--;
            }
            i++;
        }
    }
}
