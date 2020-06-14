package com.cj.algorithmdemo.javatest;

import java.util.Stack;

public class Test6 {
    /**
     一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     示例 1：

     输入：n = 2
     输出：2
     示例 2：

     输入：n = 7
     输出：21
     提示：

     0 <= n <= 100
     */
    public static void main(String[] args){//18

        System.out.println(numWays1(7));
    }

    public int numWays(int n) {
        // f(1) 1  f(2) 2
        // n =1 f(1)    1
        // n =2 f(2) f(1)+f(1)  2
        //n = 3  f(2)+f(1) ,f(1)+f(2), f(1)+f(1)+f(1)  3
        //n = 4  f(2)+f(1)+f(1)  f(1)+f(2)+f(1)  f(1)+f(1)+f(2)      f(1)+f(1)+f(1)+f(1)  4
        //n = 5  f(2)+f(1)+f(1)  f(1)+f(2)+f(1)  f(1)+f(1)+f(2)      f(1)+f(1)+f(1)+f(1)  4
        //numWays(n-1)+1;
       return 0;
    }

    /**
     * 跟斐波那契数列类似
     * @param n
     * @return
     */
    public static int numWays1(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return numWays1(n-1)+numWays1(n-2);
    }
}
