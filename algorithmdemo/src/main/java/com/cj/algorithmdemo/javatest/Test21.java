package com.cj.algorithmdemo.javatest;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test21 {
    /**
     输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     示例 1:

     输入: [10,2]
     输出: "102"
     示例 2:

     输入: [3,30,34,5,9]
     输出: "3033459"
     */
    public static void main(String[] args){
       // System.out.println("最大和："+ maxSubArray(arr));
      int[] aar = {9,30,34,5,3};
      minNumber(aar);
    }

    public static String minNumber(int[] nums) {
        List<String> strList = new ArrayList<>();
        for (int num:nums){
            strList.add(String.valueOf(num));
        }
        System.out.println("before ："+ strList);
        strList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("o1："+ o1+" o2:"+o2);
                return (o1+o2).compareTo(o2+o1);
            }
        });
        System.out.println("after："+ strList);
        StringBuilder sb = new StringBuilder();
        for (String s:strList){
            sb.append(s);
        }
        return sb.toString();
    }
}
