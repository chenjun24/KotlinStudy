package com.cj.algorithmdemo.javatest;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test30 {
    /**
     给定一棵二叉搜索树，请找出其中第k大的节点。

      

     示例 1:

     输入: root = [3,1,4,null,2], k = 1
      3
     / \
    1   4
     \
      2
     输出: 4
     示例 2:

     输入: root = [5,3,6,2,4,null,null,1], k = 3
      5
     / \
     3   6
   / \
 2   4
/
 1
     输出: 4
     */
    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(1);
        head.left = node1;
        head.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node5;
        dfs1(head);
        //System.out.println(missingNumber(arr));
    }

    public static int kthLargest(TreeNode root, int k) {


        return 0;
    }
    static int res, k;
    static  void dfs(TreeNode root) {
       if (root == null) return;
       dfs(root.right);
       if (k==0) return;
       if (--k ==0) res =root.value;
       dfs(root.left);
    }
    static  void dfs1(TreeNode root) {
        if (root == null) return;
        dfs1(root.left);
        System.out.println(root.value);
        dfs1(root.right);
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
