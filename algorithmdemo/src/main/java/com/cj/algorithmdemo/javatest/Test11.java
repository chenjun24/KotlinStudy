package com.cj.algorithmdemo.javatest;

public class Test11 {
    /**
     请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。

     示例 1：

     输入：00000000000000000000000000001011
     输出：3
     解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
     示例 2：

     输入：00000000000000000000000010000000
     输出：1
     解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
     示例 3：

     输入：11111111111111111111111111111101
     输出：31
     解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
     */

    public static void main(String[] args){//18


        System.out.println("hanming:"+hammingWeight(64));
        System.out.println("hanming:---------------------");
        System.out.println("hanming:"+hammingWeight1(64));
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
       int count =0;
       while (n>0){
           System.out.println("temp :"+n);
           if(n%2 ==1 ){
               count++;
           }
           n = n>>1;
       }
       return count;
    }
    public static int hammingWeight1(int n) {
        //1001
        // 1001 - 1  = 1000
        // 1001 & 1000 = 1000;
        // 1000 - 1  = 0111
        // 1000 & 0111 = 0;
        int count =0;
        if(n>0) count++;
        while ((n&(n-1))!= 0){
            System.out.println("temp :"+n);
                count++;
               n = n>>1;
        }
        return count;
    }
}
