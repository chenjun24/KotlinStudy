package com.cj.kotlinstudy.java;

public interface Type {
    default String getTypeName() {
        return toString();
    }
}
