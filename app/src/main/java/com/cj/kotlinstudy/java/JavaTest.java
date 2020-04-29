package com.cj.kotlinstudy.java;

import com.cj.kotlinstudy.SecondActivity;
import com.cj.kotlinstudy.test.ListTestKt;
import com.cj.kotlinstudy.utils.StaticUtil;

public class JavaTest {
    public static void main(String[] args){
        /**
         * java lambda表达式
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread:"+Thread.currentThread().getName());
            }
        }).start();

        new Thread(()->System.out.println("thread:"+Thread.currentThread().getName())).start();
        StaticUtil.doAction2();
        ListTestKt.main();
    }
}
