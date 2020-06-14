package com.cj.algorithmdemo.javatest;

import java.util.Stack;

public class Test5 {
    /**
     用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
     分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
     示例 1：
     输入：
     ["CQueue","appendTail","deleteHead","deleteHead"]
     [[],[3],[],[]]
     输出：[null,null,3,-1]
     示例 2：

     输入：
     ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
     [[],[],[5],[2],[],[]]
     输出：[null,-1,null,null,5,2]
     提示：
     */
    public static void main(String[] args){//18

        //System.out.println(findNumberIn2DArray(arr,400));
    }



  static class CQueue{

      int size = 0;
      private Stack<Integer> stack1 = new Stack<>();  // 123
      private Stack<Integer> stack2 = new Stack<>(); //2,1

      public void appendTail(int value) {
       // stack1.push(value);
          while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
          }
          stack1.push(value);
          size++;
          while (!stack2.isEmpty()){
              stack1.push(stack2.pop());
          }
      }

      public int deleteHead() {
          if (size == 0){
              return -1;
          }
          if(!stack1.isEmpty()){
              size--;
              return stack1.pop();
          }
          return -1;
      }
  }

}
