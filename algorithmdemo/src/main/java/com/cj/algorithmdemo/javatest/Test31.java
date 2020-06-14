package com.cj.algorithmdemo.javatest;


public class Test31 {
    /**
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [4,1,4,6]
     * 输出：[1,6] 或 [6,1]
     * 示例 2：
     * <p>
     * 输入：nums = [1,2,10,4,1,4,3,3]
     * 输出：[2,10] 或 [10,2]
     */
    public static void main(String[] args) {

        //System.out.println(missingNumber(arr));
    }

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            //统计该位1的出现次数情况
            int count = 0;
            int index = 1 << i;
            for (int j : nums) {
                  //该位与操作后的结果不为0，则表示该位为1的情况出现了
                if ((index & j) != 0) {
                    count++;
                }
            }
            //该位上出现1的次数mod3后为1，表示出现一次的数字该位为1
            if (count % 3 == 1) {
                result |= index;
            }
        }
        return result;
    }

    public static int[] singleNumbers(int[] nums) {
        //用于将所有的数异或起来
        int k = 0;

        for (int num : nums) {
            k ^= num;
        }

        //获得k中最低位的1
        int mask = 1;

        //mask = k & (-k) 这种方法也可以得到mask，具体原因百度 哈哈哈哈哈
        while ((k & mask) == 0) {
            mask <<= 1;
        }

        int a = 0;
        int b = 0;

        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};

    }
}
