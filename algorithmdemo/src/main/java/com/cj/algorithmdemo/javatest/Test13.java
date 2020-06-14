package com.cj.algorithmdemo.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Test13 {
    /**
     输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
     参考以下这颗二叉搜索树：
      5
     / \
    2   6
  / \
 1   3
     示例 1：

     输入: [1,6,3,2,5]
     输出: false
     示例 2：

     输入: [1,3,2,6,5]
     输出: true
     */
    public static void main(String[] args){
        int[] postorder = {1,3,2,6,5};
       // int[] postorder = {1,6,3,2,5};
        System.out.println(verifyPostorder(postorder));

    }

    public static boolean verifyPostorder(int[] postorder) {
        int i = 0;
        int j = postorder.length-1;
        return recu(postorder,i,j);
    }
    public static boolean recu(int[] postorder,int i,int j) {
        if (i==j){
            return true;
        }
        int p = i;
        while (postorder[p]<postorder[j]) p++;
        System.out.println(p);
        int m = p;
        while (postorder[p]>postorder[j]) p++;
        System.out.println(p);
        return p==j&&recu(postorder,i,m-1)&&recu(postorder,m,j-1);

    }

    static class TreeNode{
        public int value;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int value){
            this.value = value;
        }

    }

}
