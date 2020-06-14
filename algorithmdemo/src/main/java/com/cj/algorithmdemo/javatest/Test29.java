package com.cj.algorithmdemo.javatest;


public class Test29 {
    /**
     一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
     在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
     示例 1:

     输入: [0,1,3]
     输出: 2
     示例 2:

     输入: [0,1,2,3,4,5,6,7,9]
     输出: 8
     */
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int i = 1;
        while (i<nums.length){
            if(nums[i]-nums[i-1]!=1){
                return nums[i]-1;
            }
            i++;
        }
        return -1;
    }

}
