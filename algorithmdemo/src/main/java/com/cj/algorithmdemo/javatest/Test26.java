package com.cj.algorithmdemo.javatest;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test26 {
    /**
     在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。

     示例:

     s = "abaccdeff"
     返回 "b"

     s = ""
     返回 " "
     */
    public static void main(String[] args) {
        // System.out.println(translateNum(12345));
        String s = "abaccdeff";
        System.out.println(firstUniqChar(s));
    }

    public static char firstUniqChar(String s) {
        Map<Character, Boolean> dic = new HashMap<>();

        char[] array = s.toCharArray();

        for (char c : array) {
            dic.put(c, !dic.containsKey(c));
        }

        for (char c : array) {
            if (dic.get(c)) return c;
        }
        return ' ';
    }
}
