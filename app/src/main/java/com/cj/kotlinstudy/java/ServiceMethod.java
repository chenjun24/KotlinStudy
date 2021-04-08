package com.cj.kotlinstudy.java;

import java.lang.reflect.Method;

public class ServiceMethod<R, T>  {

    ServiceMethod(Builder<R, T> builder) {

    }


    static final class Builder<T, R> {
        CallAdapter<T, R> callAdapter;
        Builder(String retrofit, String method) {

        }

        public ServiceMethod build() {
            callAdapter = createCallAdapter();
            return new ServiceMethod<>(this);
        }

        private CallAdapter<T, R> createCallAdapter() {
            return new MyCallAdapter();
        }
    }
}
