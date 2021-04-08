package com.cj.algorithmdemo.javademo;

public class Test {
    //浅复制
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "hehe";
        Bag bag1 = new Bag();
        bag1.clolor = "red";
        person1.bag = bag1;

        System.out.println(person1);
        System.out.println(person1.bag.clolor);
        try {
            Person clone = (Person) person1.clone();
            System.out.println(clone);
            System.out.println(clone.bag.clolor);
            clone.bag.clolor = "black";
            System.out.println(person1.bag.clolor);
            System.out.println(clone.bag.clolor);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
