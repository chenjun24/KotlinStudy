package com.cj.algorithmdemo.javatest;


import java.util.HashSet;
import java.util.Set;

public class Test24 {
    /**
     请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
     示例 1:
     输入: "abcabcbb"
     输出: 3
     解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     示例 2:

     输入: "bbbbb"
     输出: 1
     解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     示例 3:

     输入: "pwwkew"
     输出: 3
     解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
          请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */
    public static void main(String[] args) {
        // System.out.println(translateNum(12345));
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

         return getMaxLength(s,0,0,new HashSet<Character>());
    }

    private static int getMaxLength(String s,int index,int maxLenght,Set<Character> set){
        System.out.println("index:"+index+"   s.length():"+s.length());
        if(index>=s.length()){
            return 0;
        }
        while (index<s.length()){
            if(set.contains(s.charAt(index))){
                break;
            }
            set.add(s.charAt(index));
            index++;
        }
        int size = Math.max(set.size(),maxLenght);
        System.out.println("after index:"+index+"   s.length():"+s.length()+" size:"+size);
        set.clear();
        if(size< s.length()-index && index<s.length()){
            return Math.max(size,getMaxLength(s,index,size,set));
        }else {
            return size;
        }
    }

}
