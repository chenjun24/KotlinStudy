package com.cj.algorithmdemo.javatest;


import org.w3c.dom.Node;

public class Test15 {
    /**
     请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，
     还有一个 random 指针指向链表中的任意节点或者 null。
     输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
     输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]

     */
    public static void main(String[] args){
       ListNode head = new ListNode(7);
        ListNode node = new ListNode(13);
        ListNode node1 = new ListNode(11);
        ListNode node2 = new ListNode(10);
        ListNode node3 = new ListNode(1);
        head.next = node;
        head.random = null;

        node.next = node1;
        node.random = head;

        node1.next = node2;
        node1.random = node3;

        node2.next = node3;
        node2.random = node1;

        node3.random = head;

       // System.out.println(pathSum(root,22));

    }
    public ListNode Clone(ListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        copy(pHead);
        randomDirect(pHead);
        return reList(pHead);
    }
    //拷贝链表
    private static void copy(ListNode head){
        ListNode temp = head;
        while (temp !=null){
            ListNode clone = new ListNode(temp.value);
            ListNode next = temp.next;
            temp.next = clone;
            clone.next = next;
            temp = clone.next;
        }
    }

    //指定随机指针
    private static void randomDirect(ListNode head){
        ListNode temp = head;
        while (temp !=null){
           ListNode clone = temp.next;
          if(temp.random != null){
              ListNode direct = temp.random;
              clone.random = direct.next;
          }
           temp = clone.next;
        }
    }

    //重新连接 链表
    private ListNode reList(ListNode head){
        ListNode temp = head;
        ListNode clone = temp.next;
        ListNode cloneHead = clone;
        while (temp !=null){
           // clone = temp.next;
            temp.next = clone.next;
            temp = temp.next;
            if(temp == null){
                clone.next = null;
            }else{
                clone.next = temp.next;
                clone = clone.next;
            }
        }
        return cloneHead;
    }

    static class ListNode{
        public int value;
        public ListNode next;
        public ListNode random;
        public ListNode(int value){
            this.value = value;
        }

    }

}
