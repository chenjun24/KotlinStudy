package com.cj.algorithmdemo.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Test4 {
    /**
     输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     例如，给出
     前序遍历 preorder = [3,9,20,15,7]
     中序遍历 inorder = [9,3,15,20,7]
     //后序遍历 postorder = [9,15,7,20,3]
     返回如下的二叉树：
      3
     / \
    9  20
      /  \
     15   7
      
     来源：力扣（LeetCode）
     链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
       // TreeNode node5 = new TreeNode(8);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
       // node4.left = node5;
//        System.out.println("size:"+getSize(root));
//        System.out.println("deepth:"+getDeepth(root));

        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        System.out.println(Arrays.toString(list.toArray()));
//
//        list.clear();
//        preorder1(root,list);
//        System.out.println("preorder1:"+Arrays.toString(list.toArray()));

        list.clear();
        preorder2(root,list);
        System.out.println("preorder2:"+Arrays.toString(list.toArray()));
//
//        list.clear();
//        inorder(root,list);
//        System.out.println(Arrays.toString(list.toArray()));
//
//        list.clear();
//        inorder1(root,list);
//        System.out.println("inorder1:"+Arrays.toString(list.toArray()));
//
//        list.clear();
//        postorder(root,list);
//        System.out.println(Arrays.toString(list.toArray()));
//
//        list.clear();
//        postorder1(root,list);
//        System.out.println("postorder1:"+Arrays.toString(list.toArray()));

//        int[] pO = {3,9,20,15,7};//前序遍历
//        int[] iO = {9,3,15,20,7};//中序排序的结果
//        TreeNode treeNode = createTreeNode(pO, iO);
//        list.clear();
//        postorder(treeNode,list);
//        System.out.println(Arrays.toString(list.toArray()));
    }

    /**
     * 根据二叉树 前序遍历 和中序遍历 构建二叉树
     * @param pO
     * @param iO
     */
    public static TreeNode createTreeNode(int[] pO,int[] iO){
        int length = pO.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<length;i++){
            //将中序遍历的元素 保存在map中  key为它的值  value为它的下标
            map.put(iO[i],i);
        }
        int pStart = 0;
        int pEnd = length-1;
        int iStart = 0;
        int iEnd = length-1;
       return createTreeNode(pO,iO,pStart,pEnd,iStart,iEnd,map);
    }

    /**
     *    int[] pO = {3,9,20,15,7};//前序遍历
     *    int[] iO = {9,3,15,20,7};//中序排序的结果
     * @param pO
     * @param iO
     * @param pStart
     * @param pEnd
     * @param iStart
     * @param iEnd
     * @param map
     * @return
     */
    public static TreeNode createTreeNode(int[] pO,int[] iO,int pStart, int pEnd,int iStart,int iEnd ,Map<Integer,Integer> map){
        if(pStart <= pEnd){
            TreeNode root = new TreeNode(pO[pStart]);
            int rootIndex = map.get(pO[pStart]);
            int leftCount = rootIndex-iStart;//左树节点的个数
            int rightCount = iEnd-rootIndex;//右树节点的个数
            root.left = createTreeNode(pO,iO,pStart+1,pStart+leftCount,iStart,rootIndex-1,map);
            root.right = createTreeNode(pO,iO,pEnd-rightCount+1,pEnd,rootIndex+1,iEnd,map);
            return root;
        }
        return null;
    }

    /**
     * 前序遍历 根 左 右
     * [3,9,20,15,7]
     */
    public static void preorder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.value);
        preorder(root.left,list);
        preorder(root.right,list);
    }
    /**
     *       3
     *      / \
     *     9  20
     *       /  \
     *      15   7
     * 前序遍历 根 左 右
     * [3,9,20,15,7]
     */
    public static void preorder1(TreeNode root,List<Integer> list){
        TreeNode temp = root;
        Stack<TreeNode> stack = new Stack<>();
        while (temp != null || !stack.isEmpty()){
            while (temp != null){
                list.add(temp.value);
                stack.push(temp);
                temp = temp.left;
            }
            if(!stack.isEmpty()){
                temp = stack.pop();
                temp = temp.right;
            }
        }
    }

    /**
     * 前序遍历
     * @param root
     * @param list
     */
    public static void preorder2(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        TreeNode temp = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(temp);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            list.add(pop.value);
            if(pop.right != null){
                stack.push(pop.right);
            }
            if(pop.left != null){
                stack.push(pop.left);
            }
        }
    }
    /**
     * 中序遍历 左 根 右
     * [9,3,15,20,7]
     */
    public static void inorder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left == null){
            list.add(root.value);
            return;
        }
        inorder(root.left,list);
        list.add(root.value);
        inorder(root.right,list);
    }
    /**
     * 中序遍历 左 根 右
     * [9,3,15,20,7]
     */
    public static void inorder1(TreeNode root,List<Integer> list){
        TreeNode temp = root;
        Stack<TreeNode> stack = new Stack<>();
        while (temp != null || !stack.isEmpty()){
            while (temp != null){
                stack.push(temp);
                temp = temp.left;
            }
            if(!stack.isEmpty()){
                temp = stack.pop();
                list.add(temp.value);
                temp = temp.right;
            }

        }
    }

    /**
     * 后序遍历  左右根
     *  [9,15,7,20,3]
     */
    public static void postorder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left != null){
            postorder(root.left,list);
        }
        if(root.right != null){
            postorder(root.right,list);
        }
        list.add(root.value);
    }
    /**
     *
     *              3
     *      *      / \
     *      *     9  20
     *      *       /  \
     *      *      15   7
     * 后序遍历  左右根
     *  [9,15,7,20,3]
     */
    public static void postorder1(TreeNode root,List<Integer> list){
       int left = 1;
       int right = 2;
       Stack<TreeNode> stack = new Stack<>();
       Stack<Integer> stack2 = new Stack<>();//辅助栈，用来判断子节点返回父节点时处于左节点还是右节点
        TreeNode temp = root;
        while (temp != null || !stack.empty()){
            while (temp != null){
                //将节点压入栈1 并在栈2将节点标记为左节点
                stack.push(temp);
                stack2.push(left);
                temp = temp.left;
            }
            while(!stack.isEmpty() && stack2.peek() == right){
                  //如果是从右子节点返回父节点，则任务完成，将两栈的栈顶退出
                stack2.pop();
               //System.out.println(stack.pop().value);
                list.add(stack.pop().value);
            }
            if(!stack.isEmpty() && stack2.peek() == left){
               //如果是从左子节点返回父节点 则将标记改右子节点
                stack2.pop();
                stack2.push(right);
                temp = stack.peek().right;
            }
        }

    }

    /**
     *
     * 获取树的深度
     * @param root
     * @return
     */
    public static int getDeepth(TreeNode root){
        if(root == null){
           return 0;
        }
        int left = getDeepth(root.left);
        int right = getDeepth(root.right);
        return (left > right)?(left+1):(right+1);
    }
    /**
     * 获取树的节点个数
     * @param root
     * @return
     */
    public static int getSize(TreeNode root){
        int size = 0;
        if(root != null){
            size++;
            size+= getSize(root.left);
            size+= getSize(root.right);
        }
        return size;
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
