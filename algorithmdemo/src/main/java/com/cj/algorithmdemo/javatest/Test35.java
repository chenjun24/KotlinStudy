package com.cj.algorithmdemo.javatest;


import java.util.ArrayList;
import java.util.List;

public class Test35 {
    /**

     请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。

     若队列为空，pop_front 和 max_value 需要返回 -1

     示例 1：

     输入:
     ["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
     [[],[1],[2],[],[],[]]
     输出: [null,null,null,2,1,2]
     示例 2：

     输入:
     ["MaxQueue","pop_front","max_value"]
     [[],[],[]]
     输出: [null,-1,-1]
     */
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
       // System.out.println(maxSlidingWindow(nums,3));

    }
    static class MaxQueue {

        public MaxQueue() {

        }

        public int max_value() {

            return -1;
        }

        public void push_back(int value) {

        }

        public int pop_front() {
            return -1;
        }
    }


}
