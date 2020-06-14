package com.cj.algorithmdemo.javatest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test37 {
    /**


     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(getSubSets(nums));
    }

   private static List<List<Integer>> getSubSets(int[] nums){
       List<List<Integer>> lists = new ArrayList<>();
       Arrays.sort(nums);
       backTrace(nums,0,lists,new ArrayList<Integer>());
       return lists;
   }
   // [] [1] [1,2] [1,2,2] [2] [2,2]
   private static void backTrace(int[] nums,int i,List<List<Integer>> lists,List<Integer> temp){
        lists.add(new ArrayList<Integer>(temp));
        for (int j =i;j<nums.length;j++){
            if(j>i && nums[j] == nums[j-1]){
                continue;
            }
            temp.add(nums[j]);
            backTrace(nums,j+1,lists,temp);
            temp.remove(temp.size()-1);
        }
   }
}
