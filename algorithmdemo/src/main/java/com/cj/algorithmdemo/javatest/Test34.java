package com.cj.algorithmdemo.javatest;


import java.util.ArrayList;
import java.util.List;

public class Test34 {
    /**
     给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。

     示例:

     输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
     输出: [3,3,5,5,6,7]
     解释:

     滑动窗口的位置                最大值
     ---------------               -----
     [1  3  -1] -3  5  3  6  7       3
     1 [3  -1  -3] 5  3  6  7       3
     1  3 [-1  -3  5] 3  6  7       5
     1  3  -1 [-3  5  3] 6  7       5
     1  3  -1  -3 [5  3  6] 7       6
     1  3  -1  -3  5 [3  6  7]      7
      

     提示：

     你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。

     */
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(nums,3));

    }

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i= 0;i<=nums.length-k;i++){
             int max = nums[i];
             for (int j=+1;j<i+k;j++){
                if(nums[j] > max){
                    max = nums[j];
                }
             }
             list.add(max);
        }
        return list;
    }

}
