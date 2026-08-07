package array;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] a={2,4,6,8,10,11,35};
        int[] b={1,3,5,7,9};

        int n=a.length;
        // System.out.println("length of n is "+n);
        int m=b.length;
        // System.out.println("length of n is "+m);
        int c[]=new int[n+m];

        int i=0;
        int j=0;
        int k=0;
        while (i<n && j<m) { 
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        while (i<n) { 
            c[k]=a[i];
            k++;
            i++;
        }
        while (j<m) {
            c[k]=b[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(c));
    }
}
