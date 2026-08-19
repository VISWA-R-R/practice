package Leetcodesolve;

import java.util.Arrays;

public class Twosum {
    public int[] twoSum1(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        int target=8;
        int[] result=new Twosum().twoSum1(num,target);
        System.out.println(Arrays.toString(result));
    }
}
