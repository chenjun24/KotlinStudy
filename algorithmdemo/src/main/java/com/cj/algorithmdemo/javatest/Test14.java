package com.cj.algorithmdemo.javatest;

import org.w3c.dom.Node;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test14 {
    /**
     输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
     示例:
     给定如下二叉树，以及目标和 sum = 22，

      5
     / \
    4   8
  /    / \
11    13  4
/  \    / \
7  2   5   1
     返回:
     [
     [5,4,11,2],
     [5,8,4,5]
     ]
     */
    public static void main(String[] args){
//        TreeNode root = new TreeNode(5);
//        TreeNode node1 = new TreeNode(4);
//        TreeNode node2 = new TreeNode(11);
//        TreeNode node3 = new TreeNode(7);
//        TreeNode node4 = new TreeNode(2);
//        TreeNode node5 = new TreeNode(8);
//        TreeNode node6 = new TreeNode(13);
//        TreeNode node7 = new TreeNode(4);
//        TreeNode node8 = new TreeNode(5);
//        TreeNode node9 = new TreeNode(1);
//        root.left = node1;
//        root.right = node5;
//
//        node1.left = node2;
//        node2.left = node3;
//        node2.right = node4;
//        node5.left = node6;
//        node5.right = node7;
//        node7.left = node8;
//        node7.right = node9;

        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        //System.out.println(pathSum(root,22));
      dfs(root);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int mSum = 0;
        findPath(root,sum,lists,temp,mSum);
        return lists;
    }

    /**
     *        5
     *      / \
     *     4   8
     *   /    / \
     * 11    13  4
     * /  \    / \
     * 7  2   5   1
     * @param root
     * @param sum
     * @param lists
     * @param temp
     */
    private static void findPath(TreeNode root, int sum,List<List<Integer>> lists, List<Integer> temp,int mSum){
         TreeNode node  = root;
         if(node == null){
             return;
         }
         temp.add(node.value);
         mSum+= node.value;
         if(node.left == null && node.right == null){
             if(mSum == sum){
                 lists.add(new ArrayList<Integer>(temp));
             }
             temp.remove(temp.size()-1);
             return;
         }
         findPath(root.left,sum,lists,temp,mSum);
         findPath(root.right,sum,lists,temp,mSum);
        temp.remove(temp.size()-1);
    }

    /**
     *              4
     *      *      / \
     *      *     2   5
     *      *   /  \
     *      * 1    3
     *
     *
     *1.2.3.4.5
     */
    static TreeNode pre, head;
    public static void dfs(TreeNode cur) {
        if(cur == null){
            return;
        }
        dfs(cur.left);
        if(pre != null){
            pre.right = cur;
        }else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        System.out.println(cur.value);
        dfs(cur.right);
    }

    public static TreeNode treeToDoublyList(TreeNode root) {
        TreeNode temp = root;
        if(temp == null) return null;
        dfs(temp);
        head.left = pre;
        pre.right = head;
        return null;
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
