package com.cj.algorithmdemo.javatest;


public class Test28 {
    /**
     统计一个数字在排序数组中出现的次数。
     示例 1:
     输入: nums = [5,7,7,8,8,10], target = 8
     输出: 2
     示例 2:

     输入: nums = [5,7,7,8,8,10], target = 6
     输出: 0
     */
    public static void main(String[] args) {
        int[] arr = {5,0,0,0,8,10};
        System.out.println(getLeftIndex(arr,8));
        System.out.println(getRightIndex(arr,8));
    }

    public static int search(int[] nums, int target) {

        return 0;
    }

    private static int getLeftIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
          //  System.out.println(start + "   "+end);
            int mid = (start+end)/2;
            System.out.println(mid + "   "+nums[mid]+"    target:"+target);
            if(target == nums[mid]){
                if(mid>=1 && nums[mid-1] != target){
                 //   System.out.println("111111111111111");
                    index = mid;
                    break;
                }else{
                    end = mid-1;
                    if(start == end){
                        index = start;
                        break;
                    }
                   // System.out.println("-----------------");
                    //找最左边的 target
                }
            }else if(target>nums[mid]){// 1 3 3 4 5
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return index;
    }
    private static int getRightIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
           // System.out.println(start + "   "+end);
            int mid = (start+end)/2;
           // System.out.println(mid + "   "+nums[mid]+"    target:"+target);
            if(target == nums[mid]){
                if(mid<=nums.length-1 && nums[mid+1] != target){
                  //  System.out.println("111111111111111");
                    index = mid;
                    break;
                }else{
                    start = mid+1;
                    if(start == end){
                        index = start;
                        break;
                    }
                   // System.out.println("-----------------");
                    //找最左边的 target
                }
            }else if(target>nums[mid]){// 1 3 3 4 5
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return index;
    }
}
