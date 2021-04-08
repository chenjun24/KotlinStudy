package com.cj.algorithmdemo.javatest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test38 {
    /**


     */
    public static void main(String[] args) {
        List list1 =new ArrayList();
        list1.add("1111");
        list1.add("2222");
        list1.add("3333");
        list1.add("4444");
        list1.add("5555");

        List list2 =new ArrayList();
        list2.add("3333");
        list2.add("4444");

        list1.removeAll(list2); //差异集合，相差得元素
        System.out.println(list1);
    }


}
