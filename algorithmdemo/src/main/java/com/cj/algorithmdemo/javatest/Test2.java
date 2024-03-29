package com.cj.algorithmdemo.javatest;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
    /**
     * 找出数组中重复的数字。
     *
     *
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
     * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     *
     * 示例 1：
     *
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args){
      int[] arr = {2, 3, 1, 0, 2, 5, 3};
      System.out.println(findRepeatNumber(arr));
      System.out.println(findRepeatNumber1(arr));
    }

   public static int findRepeatNumber(int[] arr){
       Set<Integer> set = new HashSet<>();
       for (int i:arr){
           if(!set.add(i)){
               return i;
           }
       }
       return -1;
   }

    /**
     * 2,3,1,0, 2, 5, 3
     * 1,3,2,0, 2, 5, 3
     * 3,1,2,0, 2, 5, 3
     * 0,1,2,3, 2, 5, 3
     *
     */
    public static int findRepeatNumber1(int[] arr){
        for (int i=0;i<arr.length;i++){
            while(i!=arr[i]){
                int temp = arr[arr[i]];
                if (temp == arr[i]){//找到重复的
                    return temp;
                }
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }
        return -1;
    }
}
