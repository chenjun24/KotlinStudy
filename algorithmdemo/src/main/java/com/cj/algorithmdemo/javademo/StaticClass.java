package com.cj.algorithmdemo.javademo;

import java.util.ArrayList;

public class StaticClass {

    static class Fruit{

    }

    static class Apple extends Fruit{
    }

    ArrayList<? extends Fruit> exdentFurit;
    ArrayList<? super Fruit> superFurit;
    Apple apple = new Apple();

    private void test() {
        Fruit a1 = exdentFurit.get(0);
       // Fruit a2 = superFurit.get(0); //Err1

        //exdentFurit.add(apple); //Err2
        superFurit.add(apple);
    }
}
