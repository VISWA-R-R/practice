package collection;

import java.util.TreeSet;

public class removeduplicateandshort {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,1,2,3,9};
        int arr1[]={2,4,5,7,6,8,9,3,5};

        TreeSet<Integer> short1=new TreeSet<>();
        for(Integer int1:arr){
            short1.add(int1);
        }
        // System.out.println(short1);
        for(Integer int2:arr1){
            short1.add(int2);
        }
        System.out.println(short1);
    }
}
