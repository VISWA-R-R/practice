package array;

import java.util.Arrays;

public class zigzag {
    public static int[] zig(int[]a,int[]b){
        int res[]=new int[a.length+b.length];
        int x=0;
        int y=0;
        for(int i=0;i<res.length;i++){
            if(i%2==0) res[i]=a[x++];
            else res[i]=b[y++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a={10,20,30,40};
        int[] b={50,60,70,80};
        System.out.println(Arrays.toString(zig(a, b)));

    }
}
