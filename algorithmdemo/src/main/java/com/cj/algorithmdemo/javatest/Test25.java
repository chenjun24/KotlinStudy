package com.cj.algorithmdemo.javatest;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test25 {
    /**
     我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
     示例:
     输入: n = 10
     输出: 12
     解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
     说明:  

     1 是丑数。
     n 不超过1690。
     */
    public static void main(String[] args) {
        // System.out.println(translateNum(12345));
        String s = "pwwkew";
        System.out.println(Arrays.toString(nthUglyNumber(10)));
    }

    private static int[] nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;

        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;

        for (int i =1;i<n;i++){
            System.out.println("factor2:"+factor2+"  factor3:"+factor3+"  factor5:"+factor5);
            int min = Math.min(Math.min(factor2,factor3),factor5);
            ugly[i] = min;
            if (factor2 == min){
                factor2 = 2*ugly[++index2];
            }
            if (factor3 == min) {
                factor3=3*ugly[++index3];
            }
            if (factor5 == min) {
                factor5=5*ugly[++index5];
            }
        }
        return ugly;
    }
}
