package com.cj.algorithmdemo.javatest;


import java.util.HashMap;
import java.util.Map;

public class Test27 {
    /**

     */
    public static void main(String[] args) {
      ListNode head = new ListNode(4);
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(8);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        head.next = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode head1 = new ListNode(5);
        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(1);
        head1.next = node4;
        node4.next = node5;
        node5.next = node1;

        System.out.println(getIntersectionNode(head,head1).value);
    }

    /**
     * 4 1 8 4 5
     * 5 0 1 8 4 5
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //思路：双指针法。
        ListNode pA = headA, pB = headB;

        while(pA != pB){
            if(pA != null){
                System.out.println("pa:"+pA.value);
            }else {
                System.out.println("pa is null");
            }
            if(pB != null){
                System.out.println("pb:"+pB.value);
            }else {
                System.out.println("pb is null");
            }
            System.out.println("----------------");
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;
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
