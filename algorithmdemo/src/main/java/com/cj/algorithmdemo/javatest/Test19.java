package com.cj.algorithmdemo.javatest;


import java.io.PipedWriter;

public class Test19 {
    /**
     输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。

     例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
     示例 1：
     输入：n = 12
     输出：5
     示例 2：

     输入：n = 13
     输出：6
     */
    public static void main(String[] args){
       // System.out.println("最大和："+ maxSubArray(arr));
        System.out.println("最大和："+ 12);
    }
    public static int countDigitOne(int n) {
        return f(n);
    }
    //1234
    private static int f(int n ) {
        if (n<=0)
            return 0;
        String s = String.valueOf(n);
        int high = s.charAt(0) - '0';
        int pow = (int) Math.pow(10,s.length()-1);
        int last = n-high*pow;
        if (high == 1){
            return f(pow-1)+1+last+f(last);
        }else {
            return pow+high*f(pow-1)+f(last);
        }
    }

}
