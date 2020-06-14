package com.cj.algorithmdemo.javatest;


import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test36 {
    /**


     */
    public static void main(String[] args) {
        //int[] nums = {1,2,3,2};
      // System.out.println(subSets1(nums));
        //System.out.println(subsetsWithDup(nums));
        int[] nums = {1,2,3,4,5,4,7,8};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    /**
     * []
     * [][1]
     * [][1][2][1,2]
     * [][1][2][1,2][2][1,2][2,2][1,2,2]
     */
    private static List<List<Integer>> subSets(int[] nums){
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<Integer>());
        for (int num:nums){
            int len = output.size();//当前的大小
            for (int i=0;i<len;i++){
                List<Integer> temp = new ArrayList<>(output.get(i));
                temp.add(num);
                output.add(temp);
            }
        }
        return output;
    }

    /**[]
     * [1] [2] [3]
     * [1,2] [1,3] [2,3]
     * [1,2,3]
     */
    private static List<List<Integer>> subSets1(int[] nums){
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(0,nums,output,temp);
        return output;
    }

    public static void backtrack(int i, int[] nums, List<List<Integer>> res, List<Integer> tmp){
        res.add(new ArrayList<>(tmp));
        //System.out.println("---------i:"+i+"  res:"+res);
        for (int j = i; j < nums.length; j++) {
         //   System.out.println("###########j:"+j);
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
        //    System.out.println("*******************j:"+j);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); //排序
        getAns(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
    private static void getAns(int[] nums, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp));
        System.out.println("---------start:"+start+"  ans:"+ans);
        for (int i = start; i < nums.length; i++) {
            //和上个数字相等就跳过
            System.out.println("###########j:"+i);
            if (i > start && nums[i] == nums[i - 1]) {
                System.out.println("~~~~~~~~~~~~~~~");
                continue;
            }
            temp.add(nums[i]);
            getAns(nums, i + 1, temp, ans);
            System.out.println("*******************i:"+i);
            temp.remove(temp.size() - 1);
        }
    }
   //
   public static int[] findErrorNums(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int a = -1;
       int b = -1;
       for (int num:nums){
          // map.put(num,!map.containsKey(num)?1:map.get(num)+1);
           map.put(num,map.getOrDefault(num,0)+1);
       }

       for (int i=1;i<=nums.length;i++){
           if (!map.containsKey(i)){
               b = i;//缺失的
           }else if (map.get(i) > 1){
               a = i;//重复的
           }
           if(a != -1 && b!=-1){
              break;
           }
       }
        return new int[]{a,b};
   }

}
