package com.cj.algorithmdemo.javatest;

public class Test12 {
    /**
     实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
     示例 1:

     输入: 2.00000, 10
     输出: 1024.00000
     示例 2:

     输入: 2.10000, 3
     输出: 9.26100
     示例 3:

     输入: 2.00000, -2
     输出: 0.25000
     解释: 2-2 = 1/22 = 1/4 = 0.25
      

     说明:

     -100.0 < x < 100.0
     n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
     */

    public static void main(String[] args){//18


        System.out.println("hanming:"+myPow(2,15));
        System.out.println("------------");
        System.out.println("hanmin1g:"+myPow1(2,15));
    }

    public static double myPow(double x, int n) {
        double b = x;
        for (int i = 1;i<n;i++){
            System.out.println("~~~~"+i);
            b*=x;
        }
        return b;
    }

    public static double myPow1(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N *= -1;
        }

        double res = 1;
        while (N > 0) {
            System.out.println("N:"+N);
            if ((N % 2) == 1) {
               // System.out.println("res:"+res+" x:"+x);
                res *= x;

            }
           // System.out.println("x:"+x);
            x *= x;
            N /= 2;
        }
        return res;
    }
}
