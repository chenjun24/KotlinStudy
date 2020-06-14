package com.cj.algorithmdemo.javatest;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test16 {
    /**
     输入一个字符串，打印出该字符串中字符的所有排列。

     你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
     示例:

     输入：s = "abc"
     输出：["abc","acb","bac","bca","cab","cba"]
      a,b,c
     */
    public static void main(String[] args){
        //permutation("abc");
        printAllPermutations1("abc");
    }

    public static void permutation(String s) {
        if(s==null){
            return;
        }
        Set<String> set = new HashSet<>();
      //  char[] chars = s.toCharArray();
        boolean[] visited = new boolean[s.length()];
        recu(s,"",visited,set);
       System.out.println(Arrays.toString(set.toArray()));
    }

    private static void recu(String s,String letter,boolean[] visited,Set<String> set){
        if(s.length() == letter.length()){
          set.add(letter);
          return ;
        }
        for (int i=0;i<s.length();i++){//abc abc
            char temp = s.charAt(i);
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            System.out.println("i"+i+"   "+letter+temp);
            recu(s,letter+ temp,visited,set);
            visited[i] = false;
        }
    }

    public static void printAllPermutations1(String str) {
        if (str == null || str.length() == 0) return;
        char[] chars = str.toCharArray();
        process(chars,0);
    }
    public static void process(char[] chars, int i) {
          if (i >= chars.length)
            return;

           if(i == chars.length-1){
               System.out.println(chars);
           }else {
               for (int j=i;j<chars.length;j++){//abc
                   System.out.println("i:"+i+"---"+chars[i]);
                   System.out.println("j:"+j+"---"+chars[j]);
                   swap(chars,i,j);
                   process(chars, i + 1);
                   swap(chars, i, j); //交换到首位及其之后位，用来固定
               }
           }
    }
    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }
}
