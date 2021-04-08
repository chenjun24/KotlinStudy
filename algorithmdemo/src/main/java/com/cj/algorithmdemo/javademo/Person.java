package com.cj.algorithmdemo.javademo;

import androidx.annotation.NonNull;

public class Person implements Cloneable{
    public String name;
    public Bag bag;

    @NonNull
    @Override
    public String toString() {
        return name+" "+bag;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
