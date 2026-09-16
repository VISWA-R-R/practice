package praticejava.day34;

import java.util.Set;
import java.util.TreeSet;

public class DistinctEvennumberLargenumberandSmallnumber {
    
    public static void main(String[] args) {
        int arr[]={2,4,6,4,8,8,2,1,3,7,9};
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        Set<Integer> set1=new TreeSet<>();
        for(int n:arr){
            set1.add(n);
        }
        Set<Integer> set2=new TreeSet<>();
        for (int n : set1) {
            if (n % 2 == 0) {
                set2.add(n);
            }
        }
        for(int n:set2){
            if (n>large) {
                small=large;
                large=n;
            }
        }
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(large);
        System.out.println(small);
    }
}
