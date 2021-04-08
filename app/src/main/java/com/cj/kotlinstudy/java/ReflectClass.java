package com.cj.kotlinstudy.java;

import android.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectClass {
    private final static String TAG = "peter.log.ReflectClass";
    // 创建对象
    public static void reflectNewInstance() {
        try {
            Class<?> aClass = Class.forName("com.cj.kotlinstudy.java.Book");
            Object o = aClass.newInstance();
            Book book = (Book) o;
            book.setName("呵呵呵");
            book.setName("hei");
            Log.d(TAG,"reflectNewInstance book = " + book.toString());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
    // 反射私有的构造方法
    public static void reflectPrivateConstructor() {
        try {
            Class<?> aClass = Class.forName("com.cj.kotlinstudy.java.Book");
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, String.class);
            declaredConstructor.setAccessible(true);
            Object o = declaredConstructor.newInstance("呵呵呵", "hei");
            Book book = (Book) o;
            Log.d(TAG,"reflectPrivateConstructor book = " + book.toString());
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    // 反射私有属性
    public static void reflectPrivateField() {
        try {
            Class<?> aClass = Class.forName("com.cj.kotlinstudy.java.Book");
            Object o = aClass.newInstance();
            Field tag = aClass.getDeclaredField("TAG");
            tag.setAccessible(true);
            String o1 = (String) tag.get(o);
            Log.d(TAG,"reflectPrivateField tag = " + tag);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    // 反射私有方法
    public static void reflectPrivateMethod() {
        try {
            Class<?> aClass = Class.forName("com.cj.kotlinstudy.java.Book");
            Method declaredMethod = aClass.getDeclaredMethod("declaredMethod", int.class);
            declaredMethod.setAccessible(true);
            Object o = aClass.newInstance();
            String invoke = (String) declaredMethod.invoke(0, 0);
            Log.d(TAG,"reflectPrivateMethod invoke = " + invoke);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
