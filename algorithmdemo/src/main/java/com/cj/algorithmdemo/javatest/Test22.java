package com.cj.algorithmdemo.javatest;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test22 {
    /**
     * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，
     * 25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
     * 示例 1:
     * <p>
     * 输入: 12258
     * 输出: 5
     * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
     */
    public static void main(String[] args) {
        System.out.println(translateNum(12345));
    }

    public static int translateNum(int num) {
        System.out.println("1----num:"+num);
        if (num <= 9) {
            return 1;
        }
        //xyzcba
        int ba = num % 100;
        System.out.println("1----ba:"+ba);
        if (ba <= 9 || ba >= 26) {
            System.out.println("1--1--num:"+(num/10) );
            return translateNum(num / 10);
        } else {
            System.out.println("1--2--num:"+(num/10)+"  "+(num/100));
            return translateNum(num / 10) + translateNum(num / 100);
        }
    }
}
