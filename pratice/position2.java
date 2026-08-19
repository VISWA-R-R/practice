package pratice;

public class position2 {
    public static void main(String[] args) {
        int[] n={4,6,5,3,8,3,5,4,7,5}; 
        int i=0,j=0,tar=5;
        int max=Integer.MIN_VALUE;
    while (i<n.length) {
        if(n[i]==tar){
            System.out.println(i);
            break; 
        }
        else{
            i++;
        }
    }
    while(j<n.length){
        if(n[j]==tar){
            if(j>max){
                max=j;
            }
            j++;
        }
        else{
            j++;
        }
    }
    System.out.println(max);
    }
}
